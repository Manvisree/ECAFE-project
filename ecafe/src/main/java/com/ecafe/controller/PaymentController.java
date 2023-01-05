package com.ecafe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecafe.entity.Payment;
import com.ecafe.service.IPaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	@Autowired
	private IPaymentService service;
	
	
	@PostMapping("/bill/{orderid}")
	public String payBill(@PathVariable ("orderid") Long orderid) {
		String message=this.service.payBill(orderid);
		return message;
		
	}
	

}
