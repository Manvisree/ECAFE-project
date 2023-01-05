package com.ecafe.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecafe.entity.CafeCombo;
import com.ecafe.entity.CafeItem;
import com.ecafe.entity.CustomerOrder;
import com.ecafe.entity.Offer;
import com.ecafe.entity.OrderItem;

public interface ICustomerService {
	public CustomerOrder addCustomer(CustomerOrder customerOrder);
	public List<CafeItem> viewItems();
	public List<CafeCombo> viewCombos();
	public List<Offer> viewOffers();
	public OrderItem placeOrder(OrderItem orderitem);
	public String cancelOrder(long orderId);
	

}
