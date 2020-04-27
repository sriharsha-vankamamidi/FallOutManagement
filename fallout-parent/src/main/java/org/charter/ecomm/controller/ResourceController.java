package org.charter.ecomm.controller;


import java.util.logging.Logger;

import org.charter.ecomm.model.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ResourceController {
	
	private static Logger LOGGER = Logger.getLogger(ResourceController.class.getName());
	
	@PostMapping("/fallout/api/v1/geOrder")
	public ResponseEntity<Order> getOrder(@RequestBody String orderId) {
		try {
			return new ResponseEntity<Order>(new Order(orderId, false), HttpStatus.OK);
		}catch(Exception ex) {
			return new ResponseEntity<Order>(HttpStatus.NOT_FOUND);
		}
	}
	
	public void saveOrder() {
		
	}
}
