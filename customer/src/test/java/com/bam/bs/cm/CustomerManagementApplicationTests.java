package com.bam.bs.cm;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.bam.bs.cm.service.CustomerService;

@SpringBootTest
class CustomerManagementApplicationTests {
	
	@MockBean
	CustomerService customerService;

	@Test
	void contextLoads() {
	}

}
