package com.revature.soda;

public class Cola extends SoftDrink {
	
	private String[] ingredients;
	private double[] quantOfIng;
	Cola() {
		super();
		ingredients = new String[] {"Caramel","Cola Nut","Vanilla"};
		quantOfIng = new double[] {0.5,0.75,0.4,0.0};
	}
	
	public double[] ingredientStmt() {
		quantOfIng[3] = getWater();
		return quantOfIng;
	}
	
	public String toString() {
		String extra = ""; 
		for (int a = 0; a < ingredients.length; ++a) {
			extra = "Cola Composition: " + ingredients[a] + ": " + quantOfIng[a];
		}
		return "Cola [" + extra + "]";
	}

}
