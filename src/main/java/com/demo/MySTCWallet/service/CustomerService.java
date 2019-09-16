package com.demo.MySTCWallet.service;

import com.demo.MySTCWallet.model.Customer;

import java.util.List;

public interface CustomerService {

    public Customer createNewCustomer (Customer customer);

    List<Customer> findAll();

}
