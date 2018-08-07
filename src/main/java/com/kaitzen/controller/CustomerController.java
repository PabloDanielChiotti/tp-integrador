package com.kaitzen.controller;

import com.kaitzen.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/customers")
    public String customers(Model model) {
        model.addAttribute("customers", this.customerRepository.findAll());
        return "customers";
    }
}
