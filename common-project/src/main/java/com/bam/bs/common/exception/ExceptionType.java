package com.bam.bs.common.exception;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ExceptionType {

	private final String type;

	public ExceptionType(String type) {
		super();
		this.type = type;
	}

}
