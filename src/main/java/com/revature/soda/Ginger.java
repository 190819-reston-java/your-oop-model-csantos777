package com.revature.soda;

public class Ginger extends SoftDrink{
		
	private String name;
	private String[] ingredients;
	private double[] recipeQuant;
	
	private static boolean isGingerRaw;
	private static String gingerDrinkType;
	Ginger() {
		super();
		name = "Generic";
		ingredients = new String[] {"Ginger","Lemon","Lime",getWater()};
		recipeQuant = new double[] {0.5,0.1,0.1,0.3};
		isGingerRaw = true;
		gingerDrinkType = "Ginger Ale";
	}
	Ginger(String name, String drinkType, boolean isGingerRaw) {
		super();
		this.name = name;
		ingredients = new String[] {"Ginger","Lemon","Lime",getWater()};
		recipeQuant = new double[] {0.5,0.1,0.1,0.3};
		this.isGingerRaw = isGingerRaw;
		this.gingerDrinkType = drinkType;
	}
	Ginger(String name, String drinkType, boolean isGingerRaw, double ing1, double ing2, double ing3, double ing4) {
		super();
		this.name = name;
		ingredients = new String[] {"Ginger","Lemon","Lime",getWater()};
		this.isGingerRaw = isGingerRaw;
		this.gingerDrinkType = drinkType;
		recipeQuant = new double[] {ing1,ing2,ing3,ing4};
	}
	
	public String getGingerDrinkType() {
		return this.gingerDrinkType;
	}
	
	public boolean isGingerRaw() {
		return isGingerRaw;
	}
	
	public boolean isValidGingerDrink() {
		return isValidLiquid(recipeQuant);
	}
	
	public String feedback(String shortReview) {
		return shortReview;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		
	@Override
	public String toString() {
		String extra = "Ginger [Name: " + name + " SugarType: " + getSugarType(0) + " Fizz: " + getFizz() + 
				" Ginger Composition: "; 
		for (int a = 0; a < ingredients.length; ++a) {
			extra += ingredients[a] + ": " + recipeQuant[a] + " ";
		}
		return extra + "valid?: " + isValidGingerDrink() + "]";
	}

}
