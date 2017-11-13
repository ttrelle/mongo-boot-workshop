package mongoboot.repo;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import mongoboot.domain.Item;
import mongoboot.domain.Order;

/**
 * Test cases for the {@link OrderRepository}.
 * 
 * @author Tobias Trelle
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes=LocalhostMongoConfiguration.class)
public class OrderRepositoryTest {

	@Autowired OrderRepository repo;	
	
	@BeforeEach void setUp() {
		repo.deleteAll();
	}
	
	@Test void shouldFindByItemsQuantity() {
		// given
		Order order = new Order("Tobias Trelle, gold customer");
		List<Item> items = new ArrayList<Item>();
		items.add( new Item(1, 47.11, "Item #1") );
		items.add( new Item(2, 42.0, "Item #2") );
		order.setItems(items);
		repo.save(order);
		
		// when
		List<Order> orders = repo.findByItemsQuantity(2);
		
		// then
		assertThat(orders, notNullValue());
		assertThat(orders.size(), is(1));
	}
	
}
