package com.bam.bs.common.response;

import com.bam.bs.common.exception.ExceptionType;

import lombok.Getter;

@Getter
public class ErrorResponse {

	ExceptionType exceptionType;

	private final String message;

	public ErrorResponse(ExceptionType exceptionType, String message) {
		super();
		this.exceptionType = exceptionType;
		this.message = message;
	}

}
