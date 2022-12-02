package com.mypack.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.mypack.model.ApiError;

@RestController
@RestControllerAdvice
public class RestExceptionHandler {
	
	@ExceptionHandler(value=NoProductFoundException.class)
	public ResponseEntity<ApiError> handleNoProductFoundException(){
		
		ApiError error=new ApiError(400, "Product not found!!!", new Date());
		
		return new ResponseEntity<ApiError>(error,HttpStatus.BAD_REQUEST);
	}

}
