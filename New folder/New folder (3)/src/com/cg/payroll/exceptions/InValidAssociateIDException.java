package com.cg.payroll.exceptions;
@SuppressWarnings("serial")
public class InValidAssociateIDException extends Exception{

	public InValidAssociateIDException() {
		this("Please enter a valid assoicate ID");
	}

	public InValidAssociateIDException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public InValidAssociateIDException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public InValidAssociateIDException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public InValidAssociateIDException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
}