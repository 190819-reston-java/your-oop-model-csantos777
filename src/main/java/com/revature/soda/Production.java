package com.revature.soda;

public interface Production {
	
	// this evaluates how the drink is made.
	// if it's made in a sophisticated factory, for example, it is likely that the carbination is intense
	// if it's made in smaller batches, closer to "cooking it in a kettle", the carbonation won't be as intense.
	double meansOfMixing();
}
