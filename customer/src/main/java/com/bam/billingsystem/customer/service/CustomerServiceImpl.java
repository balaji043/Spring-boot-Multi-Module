package com.bam.billingsystem.customer.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bam.billingsystem.customer.model.Customer;
import com.bam.billingsystem.customer.repository.CustomerRepository;
import com.bam.billingsystem.customer.util.ExceptionTypes;
import com.bam.billingsystem.exception.CommonException;
import com.bam.billingsystem.util.CommonUtil;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	
	@Override
	public Customer saveCustomer(Customer customer) {
		if(Objects.nonNull(customer)) {
			
			if(CommonUtil.isStringNullOrEmpty(customer.getName())) {
				throw new CommonException(ExceptionTypes.BadRequest);
			}
			
			if(CommonUtil.isStringNullOrEmpty(customer.getAge())) {
				throw new CommonException(ExceptionTypes.BadRequest);
			}
			
			customerRepository.save(customer);

			return customer;

		} else {
			throw new CommonException(ExceptionTypes.BadRequest);
		}
	}

}
