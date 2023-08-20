package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Service.CustomerService;

import com.example.demo.model.Customer;
@CrossOrigin (origins="http://localhost:4200")
@RequestMapping("/api/Customer")
@Controller

public class Customercontroller {
public CustomerService customerservive;

public Customercontroller(CustomerService customerservive) {
	super();
	this.customerservive = customerservive;
}
@PostMapping
public ResponseEntity<Customer> SaveCustomer(@RequestBody Customer customer)
{
	return new ResponseEntity<Customer>(customerservive.saveCustomer(customer),HttpStatus.CREATED);
}

@GetMapping
public List<Customer> getallcustomer(){
	return customerservive.getallCustomer();
}
}


