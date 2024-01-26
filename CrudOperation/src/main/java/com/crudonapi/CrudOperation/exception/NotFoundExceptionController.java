package com.crudonapi.CrudOperation.exception;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class NotFoundExceptionController {

	// With the help to show exception message in-front of user
    @ExceptionHandler(value= {NotFoundEmployeeException.class})	
	public ResponseEntity<Object> handledEmployeeNotFoundException(NotFoundEmployeeException employeeException) {

		HandledExceptionModel exceptionModel = new HandledExceptionModel(employeeException.getMessage(),
				employeeException.getCause(), HttpStatus.NOT_FOUND);
		

		return new ResponseEntity<>(exceptionModel, HttpStatus.NOT_FOUND);
	}
}
