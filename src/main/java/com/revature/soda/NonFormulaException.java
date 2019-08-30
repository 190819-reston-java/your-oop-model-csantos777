package com.revature.soda;

public class NonFormulaException extends RuntimeException {
	
	public NonFormulaException(String reason) {
		super("This isn't a valid drink: " + reason);
	}

}
