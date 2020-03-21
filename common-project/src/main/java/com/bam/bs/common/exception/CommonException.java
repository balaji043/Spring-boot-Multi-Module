package com.bam.bs.common.exception;

import lombok.Getter;


/**
 * Common Exception across all the sub modules of Billing System
 */

@Getter
public class CommonException extends RuntimeException{

	private static final long serialVersionUID = -3193195717939345240L;

	private final transient ExceptionType exceptionType;
	
	public CommonException(ExceptionType exceptionType) {
		super();
		this.exceptionType = exceptionType;
	}
	
}
