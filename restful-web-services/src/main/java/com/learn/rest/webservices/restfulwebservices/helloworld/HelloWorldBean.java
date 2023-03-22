package com.learn.rest.webservices.restfulwebservices.helloworld;

import java.io.Serializable;

public class HelloWorldBean implements Serializable {

	private String message;

	public HelloWorldBean(String message) {

		this.message = message;
	}

	public Object getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}

}
