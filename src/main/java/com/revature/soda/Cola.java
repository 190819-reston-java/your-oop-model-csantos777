package com.revature.soda;

public class Cola extends SoftDrink {
	
	private String name;
	private String[] ingredients;
	private double[] recipeQuant;
	Cola() {
		super();
		name = "Generic";
		ingredients = new String[] {"Caramel","Cola Nut","Vanilla",getWater()};
		recipeQuant = new double[] {0.3,0.4,0.1,0.2};
	}
	Cola(String name, double ing1, double ing2, double ing3, double ing4) {
		super();
		this.name = name;
		ingredients = new String[] {"Caramel","Cola Nut","Vanilla",getWater()};
		
		recipeQuant = new double[] {ing1,ing2,ing3,ing4};
	}
	
	
	public boolean isValidColaDrink() {
		return isValidLiquid(recipeQuant);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String feedback(String shortReview) {
		return shortReview;
	}
	
	@Override
	public String toString() {
		String extra = "Cola [Name: " + name + " SugarType: " + getSugarType(0) + " Fizz: " + getFizz() + 
				" Cola Composition: "; 
		for (int a = 0; a < ingredients.length; ++a) {
			extra += ingredients[a] + ": " + recipeQuant[a] + " ";
		};
		return extra + "]";
	}

}
