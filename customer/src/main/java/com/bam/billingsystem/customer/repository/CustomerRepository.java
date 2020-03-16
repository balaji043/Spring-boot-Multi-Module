package com.bam.billingsystem.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bam.billingsystem.customer.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
