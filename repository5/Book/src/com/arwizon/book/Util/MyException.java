package com.arwizon.book.Util;

public class MyException extends Exception {
	String message;
	public MyException(String msg) {
		this.message = msg;
	}
	public String getMessage() {
		return message;
	}
	}

