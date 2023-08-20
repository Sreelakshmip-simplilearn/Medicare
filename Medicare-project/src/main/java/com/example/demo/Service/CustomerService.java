package com.example.demo.Service;

import java.util.List;

import com.example.demo.model.Customer;

public interface CustomerService {
Customer saveCustomer(Customer customer);
List<Customer> getallCustomer();
}
