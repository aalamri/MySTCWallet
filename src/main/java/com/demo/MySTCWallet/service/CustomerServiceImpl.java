package com.demo.MySTCWallet.service;

import com.demo.MySTCWallet.model.Customer;
import com.demo.MySTCWallet.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerRepository customerRepository;

    public Customer createNewCustomer(Customer customer){

        return customerRepository.save(customer);
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

}
