package com.bam.billingsystem.response;

import com.bam.billingsystem.exception.ExceptionType;

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
