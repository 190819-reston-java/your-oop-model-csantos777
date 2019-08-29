package com.revature.soda;

public interface Production {
	
	// evaluates whether the water used is pure.
	boolean waterIsPure();
	
	// evaluates whether carbon dioxide is added.
	// will also evaluate the intensity.
	double carbonation(String type);
}
