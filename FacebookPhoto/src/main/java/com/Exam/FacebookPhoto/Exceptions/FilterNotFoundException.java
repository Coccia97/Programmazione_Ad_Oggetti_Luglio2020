package com.Exam.FacebookPhoto.Exceptions;

public class FilterNotFoundException extends ClassNotFoundException{


	private static final long serialVersionUID = 2L;

	public FilterNotFoundException() {
		super();
	}

	public FilterNotFoundException(String message) {
		super(message);
	}

}