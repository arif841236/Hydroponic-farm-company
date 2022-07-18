package com.hydroponicwebsite.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(AdminException.class)
	public ResponseEntity<MyError> adminExceptionHandler(AdminException admin, WebRequest wr){
		MyError err= new MyError(LocalDateTime.now(),admin.getMessage(),wr.getDescription(false));
		return new ResponseEntity<MyError>(err,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(UserException.class)
	public ResponseEntity<MyError> userExceptionHandler(UserException user, WebRequest wr){
		MyError err= new MyError(LocalDateTime.now(),user.getMessage(),wr.getDescription(false));
		return new ResponseEntity<MyError>(err,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(CustomerException.class)
	public ResponseEntity<MyError> customerExceptionHandler(CustomerException ce, WebRequest wr){
		MyError err= new MyError(LocalDateTime.now(),ce.getMessage(), wr.getDescription(false));
		return new ResponseEntity<MyError>(err, HttpStatus.BAD_REQUEST);
	}
}
