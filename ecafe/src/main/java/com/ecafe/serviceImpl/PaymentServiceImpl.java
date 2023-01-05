package com.ecafe.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecafe.entity.CustomerOrder;
import com.ecafe.entity.Payment;
import com.ecafe.enumeration.PaymentStatus;
import com.ecafe.enumeration.PaymentType;
import com.ecafe.repository.CustomerOrderRepository;
import com.ecafe.repository.PaymentRepository;
import com.ecafe.service.IPaymentService;
@Service
public class PaymentServiceImpl implements IPaymentService{
	@Autowired
	private CustomerOrderRepository repo;
	@Autowired
	private PaymentRepository payrepo;

	@Override
	public String payBill(Long orderId) {
		// TODO Auto-generated method stub
		Optional<CustomerOrder> findById = this.repo.findById(orderId);
		Payment payment=new Payment();
		if(findById.isPresent()) {
			payment.setCustomerId(findById.get().getCustomerId());
			payment.setAmount(findById.get().getFinalAmount());
			payment.setOrderId(findById.get().getOrderId());
			payment.setStatus(PaymentStatus.SUCCESS);
			payment.setPaidBy(PaymentType.CASH);
			this.payrepo.save(payment);
			return "this is user bill";
		}
		else {
			return "please check ur orderid";
		}
		
	}
	
	

}
