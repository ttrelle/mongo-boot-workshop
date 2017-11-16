package mongoboot.repo;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;

import mongoboot.domain.Order;

public class OrderRepositoryImpl implements CustomOrderRepository {

	@Autowired
	MongoTemplate mongo;
	
	
	@Override
	public double totalSum() {
		Aggregation agg = Aggregation.newAggregation(
				project("items").andExclude("_id"),
				unwind("items"),
				group().sum("items.price").as("total")
				);
		
		AggregationResults<TotalAmount> total = 
				mongo.aggregate(agg, Order.class, TotalAmount.class);
		return total.getUniqueMappedResult().total;
	}

	private class TotalAmount {
		private double total;
	}
	
}
