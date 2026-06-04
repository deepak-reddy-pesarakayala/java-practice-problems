package com.java.service;

import com.java.spring.bean.Customer;

public class CustomerServiceImpl implements CustomerService {

    @Override
    public Customer save(Customer customer) {
        System.out.println("CustomerServiceImpl: Customer Saved");
        return customer;
    }
}