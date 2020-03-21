package com.bam.bs.cm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bam.bs.cm.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
