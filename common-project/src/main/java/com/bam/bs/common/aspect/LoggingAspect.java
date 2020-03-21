package com.bam.bs.common.aspect;

import java.util.Objects;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Aspect
@Component
@ComponentScan
@Configuration
public class LoggingAspect {
	
	@Bean
	public LoggingAspect getLoggingAspect() {
		return new LoggingAspect();
	}
	
	final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

	@AfterThrowing(pointcut = "within(com.bam.bs.*)", throwing = "exception")
	public void logAfterThrowingAllMethods(Throwable exception) throws Throwable {
//		final Logger LOGGER = LoggerFactory.getLogger(jp.getTarget().getClass());

		LOGGER.error("{}", exception);

		StackTraceElement[] stackTaces = exception.getStackTrace();

		if (Objects.nonNull(stackTaces) && stackTaces.length > 0) {
			for (StackTraceElement s : stackTaces) {
				if (s.getClass().getPackage().toString().startsWith("com.bam.billingsystem")) {
					LOGGER.error("{}", s);
				}
			}
		}

	}
}