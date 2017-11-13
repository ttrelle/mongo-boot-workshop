package mongoboot.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import mongoboot.domain.Order;

public interface OrderRepository extends MongoRepository<Order, String> {

	List<Order> findByItemsQuantity(int quantity);

	
}
