package com.slk.components.exception;

import org.springframework.stereotype.Component;


@Component
public class UserServiceException extends RuntimeException {
	//private Response response
	private String message;


	public UserServiceException setExceptionMessage(String msg){
		this.message = msg;
		return this;
	}

	@Override
	public String getMessage() {
		return message;
	}
}
