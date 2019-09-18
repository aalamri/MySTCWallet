package com.demo.MySTCWallet.controller;

import com.demo.MySTCWallet.dto.CreateCustomerResponseDTO;
import com.demo.MySTCWallet.dto.CustomerRequestDTO;
import com.demo.MySTCWallet.model.Customer;
import com.demo.MySTCWallet.repository.CustomerRepository;
import com.demo.MySTCWallet.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/customer")
    public ResponseEntity createNewCustomer(@Valid @RequestBody Customer customer) {
        return ResponseEntity.ok(customerService.createNewCustomer(customer));
    }

    @GetMapping("/customers")
    public ResponseEntity<List<Customer>> findAll() {
        return ResponseEntity.ok(customerService.findAll());
    }


}
