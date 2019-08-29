package com.revature.soda;

public interface Production {
	
	// evaluates whether the water used is pure.
	boolean waterIsPure();
	
	// evaluates whether carbon dioxide is added.
	// will also evaluate the intensity, in which I'll just change this to double soon enough.
	boolean carbonation();
}
