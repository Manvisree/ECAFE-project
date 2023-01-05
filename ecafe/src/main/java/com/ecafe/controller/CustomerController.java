package com.ecafe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecafe.entity.CafeCombo;
import com.ecafe.entity.CafeItem;
import com.ecafe.entity.CustomerOrder;
import com.ecafe.entity.Offer;
import com.ecafe.entity.OrderItem;
import com.ecafe.service.ICustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private ICustomerService custservice;
	
	@GetMapping("/items")
	public List<CafeItem> viewItems(){
		List<CafeItem> item = this.custservice.viewItems();
		return item;
		
	}
	
	@GetMapping("/allcombos")
	public List<CafeCombo> viewCombos(){
		List<CafeCombo> combo = custservice.viewCombos();
		return combo;
		
	}
	
	@GetMapping("/alloffers")
	public List<Offer> viewOffers(){
		List<Offer> offer = custservice.viewOffers();
		return offer;
		
	}
	
	@PostMapping("/placeorder")
	public OrderItem placeOrder(OrderItem orderItem) {
		OrderItem orderitem=this.custservice.placeOrder(orderItem);
		return orderitem;
		
	}
	
	@DeleteMapping("/deleteorder/{orderid}")
	public String cancelOrder(@PathVariable ("orderid") long orderId) {
		String message=this.custservice.cancelOrder(orderId);
		return message;
	}
	
	@PostMapping("/addcustomer")
	public CustomerOrder addCustomer(CustomerOrder customerOrder) {
		CustomerOrder addcustomer=this.custservice.addCustomer(customerOrder);
		return addcustomer;
		
	}

}
