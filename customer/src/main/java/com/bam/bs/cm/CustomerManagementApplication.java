package com.bam.bs.cm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = { "com.bam.bs" })
@EnableJpaRepositories(basePackages = { "com.bam.bs" })
@EntityScan(basePackages = { "com.bam.bs" })
@ComponentScan(basePackages = { "com.bam.bs" })
public class CustomerManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerManagementApplication.class, args);
	}

}
