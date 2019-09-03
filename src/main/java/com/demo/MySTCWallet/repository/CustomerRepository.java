package com.demo.MySTCWallet.repository;

import com.demo.MySTCWallet.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
