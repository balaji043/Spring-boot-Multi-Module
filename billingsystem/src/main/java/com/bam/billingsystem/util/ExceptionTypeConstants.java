package com.bam.billingsystem.util;

import com.bam.billingsystem.exception.ExceptionType;

public interface ExceptionTypeConstants {

	public static final ExceptionType BadRequest = new ExceptionType("BadRequest");
	
	public static final ExceptionType SERVER_ERROR = new ExceptionType("SERVER_ERROR");
	
	public static final ExceptionType SOMER_COMMON_ERROR_3 = new ExceptionType("SOMER_COMMON_ERROR_3");

}
