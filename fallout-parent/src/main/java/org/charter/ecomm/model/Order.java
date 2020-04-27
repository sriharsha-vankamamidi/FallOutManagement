package org.charter.ecomm.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("unused")
public class Order {
	
	private String id;
	private String orderId;
	private boolean isExistingCustomer;
	private Customer customer; 
	private Schedule schedule;
	
	public Order(String orderId, boolean isExistingCustomer) {
		this.orderId = orderId;
		this.isExistingCustomer = isExistingCustomer;
	}

}
