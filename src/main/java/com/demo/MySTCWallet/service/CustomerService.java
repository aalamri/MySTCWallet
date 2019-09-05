package com.demo.MySTCWallet.service;

import com.demo.MySTCWallet.dto.CreateCustomerResponseDTO;
import com.demo.MySTCWallet.model.Customer;

import java.text.ParseException;

public interface CustomerService {

    public CreateCustomerResponseDTO createNewCustomer(Customer customerRequest)
            throws ParseException;
}
