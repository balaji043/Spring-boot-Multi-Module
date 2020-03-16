package com.bam.billingsystem.customer.util;

import com.bam.billingsystem.exception.ExceptionType;
import com.bam.billingsystem.util.ExceptionTypeConstants;

public class ExceptionTypes implements ExceptionTypeConstants {

	
	private ExceptionTypes() {
		
	}
	
	public static final ExceptionType SOMER_SPECIFIC_ERROR_1 = new ExceptionType("SOMER_SPECIFIC_ERROR_1");

	public static final ExceptionType SOMER_SPECIFIC_ERROR_2 = new ExceptionType("SOMER_SPECIFIC_ERROR_2");

	public static final ExceptionType SOMER_SPECIFIC_ERROR_3 = new ExceptionType("SOMER_SPECIFIC_ERROR_3");

}
