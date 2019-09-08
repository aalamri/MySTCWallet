package com.demo.MySTCWallet.service;

import com.demo.MySTCWallet.dto.CreateCustomerResponseDTO;
import com.demo.MySTCWallet.model.Customer;
import com.demo.MySTCWallet.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.text.ParseException;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public CreateCustomerResponseDTO createNewCustomer(Customer customerRequest) throws ParseException {
        CreateCustomerResponseDTO createCustomerResponseDTO = new CreateCustomerResponseDTO();


        return createCustomerResponseDTO;

    }
}
