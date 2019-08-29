package com.revature.soda;

public class Cola extends SoftDrink {
	
	private String[] ingredients;
	private double[] recipeQuant;
	Cola() {
		super();
		ingredients = new String[] {"Caramel","Cola Nut","Vanilla",getWater()};
		recipeQuant = new double[] {0.3,0.4,0.1,0.2};
	}
	Cola(double ing1, double ing2, double ing3, double ing4) {
		super();
		ingredients = new String[] {"Caramel","Cola Nut","Vanilla",getWater()};
		
		recipeQuant = new double[] {ing1,ing2,ing3,ing4};
	}
	
	
	public boolean isValidColaDrink() {
		return isValidLiquid(recipeQuant);
	}
	
	public String feedback(String shortReview) {
		return shortReview;
	}
	
	@Override
	public String toString() {
		String extra = "Cola [SugarType: " + getSugarType(0) + " Fizz: " + getFizz() + 
				" Cola Composition: "; 
		for (int a = 0; a < ingredients.length; ++a) {
			extra += ingredients[a] + ": " + recipeQuant[a] + " ";
		};
		return extra + "]";
	}

}
