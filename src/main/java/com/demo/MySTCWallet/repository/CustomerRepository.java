package com.demo.MySTCWallet.repository;

import com.demo.MySTCWallet.dto.CreateCustomerResponseDTO;
import com.demo.MySTCWallet.dto.CustomerRequestDTO;
import com.demo.MySTCWallet.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.text.ParseException;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findCustomerById(long id);

    public CreateCustomerResponseDTO createNewCustomer (CustomerRequestDTO customerRequestDTO)
            throws ParseException;

}
