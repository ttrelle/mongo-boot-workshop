package mongoboot.domain;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public class Order {

	@Id private String id;
	
	private LocalDate date;
	
	@Field("custInfo") private String customerInfo;
	
	List<Item> items;
	
	public Order() {
		this.date = LocalDate.now();
	}

	public Order(String customerInfo, Item... items) {
		this();
		this.customerInfo = customerInfo;
		this.items = Arrays.asList(items);
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getCustomerInfo() {
		return customerInfo;
	}

	public void setCustomerInfo(String customerInfo) {
		this.customerInfo = customerInfo;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	
}
