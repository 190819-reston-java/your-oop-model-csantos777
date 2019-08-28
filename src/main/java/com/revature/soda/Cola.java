package com.revature.soda;

public class Cola extends SoftDrink {
	
	private String[] ingredients;
	Cola() {
		super();
		ingredients = new String[] {"Caramel","Cola Nut","Vanilla"};
	}
	
	public double ingredientMixer() {
		return 0.0;
	}

}
