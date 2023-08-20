package com.example.demo.Service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Dao.CustomerDao;
import com.example.demo.Service.CustomerService;
import com.example.demo.model.Customer;
@Service
public class CustomerServiceimpl implements CustomerService {
 public CustomerDao customerdao  ;
	
	public CustomerServiceimpl(CustomerDao customerdao) {
	super();
	this.customerdao = customerdao;
}

	@Override
	public Customer saveCustomer(Customer customer) {
		return customerdao.save(customer);
	}

	@Override
	public List<Customer> getallCustomer() {
		return customerdao.findAll();
	}

}
