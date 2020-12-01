package com.slk.components.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(value =UserServiceException.class)
	public void exceptionHandler(UserServiceException e){
		System.out.println("未知异常！原因是:"+e.getMessage());
	}
}
