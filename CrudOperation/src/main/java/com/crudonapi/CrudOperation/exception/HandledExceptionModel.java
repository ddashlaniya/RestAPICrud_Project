package com.crudonapi.CrudOperation.exception;

import org.springframework.http.HttpStatus;

public class HandledExceptionModel {

	private final String massege;
	private final Throwable throwable;
	private final HttpStatus couse;

	public HandledExceptionModel(String massege, Throwable throwable, HttpStatus couse) {
		super();
		this.massege = massege;
		this.throwable = throwable;
		this.couse = couse;
	}
	public String getMassege() {
		return massege;
	}
	public Throwable getThrowable() {
		return throwable;
	}
	public HttpStatus getCouse() {
		return couse;
	}
}
