package com.bam.bs.common.aspect;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.bam.bs.common.exception.CommonException;
import com.bam.bs.common.response.ErrorResponse;
import com.bam.bs.common.util.ExceptionTypeConstants;

@ControllerAdvice
public class CommonExceptionHandler {

	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<Object> exception(Exception exception) {
		ErrorResponse errorResponse = new ErrorResponse(ExceptionTypeConstants.SERVER_ERROR, exception.getMessage());
		return new ResponseEntity<Object>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(value = CommonException.class)
	public ResponseEntity<Object> exception(CommonException exception) {
		ErrorResponse errorResponse = new ErrorResponse(exception.getExceptionType(), "");
		return new ResponseEntity<Object>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
