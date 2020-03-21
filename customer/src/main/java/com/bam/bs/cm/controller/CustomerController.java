package com.bam.bs.cm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bam.bs.cm.model.Customer;
import com.bam.bs.cm.service.CustomerService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/customer/create")
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
		log.info(customer.toString());
        return ResponseEntity.ok(customerService.saveCustomer(customer));
    }

}
