package com.revature.soda;

public interface Production {
	
	// evaluates whether the water used is pure.
	boolean waterIsPure();
	
	// evaluates whether carbon dioxide is added.
	// needs to call meansOfProduction() function to
	// evaluate how intense the carbonation is.
	double carbonation(String type);
	
	// this evaluates how the drink is made.
	// if it's made in a sophisticated factory, for example, it is likely that the carbination is intense
	// if it's made in smaller batches, closer to "cooking it in a kettle", the carbonation won't be as intense.
	//String meansOfProduction();
}
