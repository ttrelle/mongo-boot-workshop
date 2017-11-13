package mongoboot.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import mongoboot.domain.Order;

@RepositoryRestResource
public interface OrderRepository extends MongoRepository<Order, String> {

	List<Order> findByItemsQuantity(@Param("quantity") int quantity);

	
}
