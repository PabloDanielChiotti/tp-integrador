package com.kaitzen.controller;

import com.kaitzen.model.Customer;
import com.kaitzen.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerRestController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/api/customers")
    List<Customer> getCustomers() {
        return this.customerRepository.findAll();
    }

}
