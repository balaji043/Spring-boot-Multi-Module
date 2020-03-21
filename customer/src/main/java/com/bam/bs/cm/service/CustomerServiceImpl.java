package com.bam.bs.cm.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bam.bs.cm.model.Customer;
import com.bam.bs.cm.repository.CustomerRepository;
import com.bam.bs.cm.util.ExceptionTypes;
import com.bam.bs.common.exception.CommonException;
import com.bam.bs.common.util.CommonUtil;

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
