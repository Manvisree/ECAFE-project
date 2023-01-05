package com.ecafe.serviceImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ecafe.entity.CafeCombo;
import com.ecafe.entity.CafeItem;
import com.ecafe.entity.CustomerOrder;
import com.ecafe.entity.Offer;
import com.ecafe.entity.OrderItem;
import com.ecafe.repository.CafeComboRepository;
import com.ecafe.repository.CafeItemRepository;
import com.ecafe.repository.CustomerOrderRepository;
import com.ecafe.repository.OfferRepository;
import com.ecafe.repository.OrderItemRepository;
import com.ecafe.service.ICustomerService;


@Service
public class CustomerServiceImpl implements ICustomerService{
	@Autowired
	private CustomerOrderRepository custrepo;
	@Autowired
	private CafeItemRepository cafeItemRepo;
	@Autowired
	private CafeComboRepository cafeComboRepo;
	@Autowired
	private OfferRepository offerRepo;
    @Autowired
	private OrderItemRepository orderItemRepo;

	@Override
	public List<CafeItem> viewItems() {
		// TODO Auto-generated method stub
		return this.cafeItemRepo.findAll();
		
	}

	@Override
	public List<CafeCombo> viewCombos() {
		// TODO Auto-generated method stub
		return this.cafeComboRepo.findAll();
	}

	@Override
	public List<Offer> viewOffers() {
		// TODO Auto-generated method stub
		return this.offerRepo.findAll();
	}

	@Override
	public OrderItem placeOrder(OrderItem orderItem) {
		// TODO Auto-generated method stub
		return this.orderItemRepo.save(orderItem);
	}

	@Override
	public String cancelOrder(long orderId) {
		// TODO Auto-generated method stub
		OrderItem order=this.orderItemRepo.findById(orderId).get();
		if(order!= null) {
			this.orderItemRepo.delete(order);
			return "Your order is canceled successfully";
		}
		return "Order is not yet placed";
	}

	@Override
	public CustomerOrder addCustomer(CustomerOrder customerOrder) {
		// TODO Auto-generated method stub
		
		return this.custrepo.save(customerOrder);
	}
}
	
