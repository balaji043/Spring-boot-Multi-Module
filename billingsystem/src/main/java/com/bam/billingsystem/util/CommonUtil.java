package com.bam.billingsystem.util;

import java.util.List;

public class CommonUtil {

	private CommonUtil() {

	}

	public static boolean isStringNullOrEmpty(String s) {
		return s == null || s.isEmpty();
	}
	
	public static boolean isListNullOrEmpty(List<?> list) {
		return list == null || list.isEmpty();
	}
	
}
