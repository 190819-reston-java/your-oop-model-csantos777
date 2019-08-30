package com.revature.soda;

public class Ginger extends SoftDrink implements Production {
		
	private String name;
	private String[] ingredients;
	private double[] recipeQuant;
	private double waterLeft;
	
	private static boolean isGingerRaw;
	private static String gingerDrinkType;
	Ginger() {
		super();
		name = "Generic";
		waterLeft = 0;
		ingredients = new String[] {"Ginger","Lemon","Lime"};
		recipeQuant = new double[] {0.5,0.1,0.1};
		isGingerRaw = true;
		gingerDrinkType = "Ginger Ale";
	}
	Ginger(String name, String drinkType, boolean isGingerRaw) {
		super();
		this.name = name;
		waterLeft = 0;
		ingredients = new String[] {"Ginger","Lemon","Lime"};
		recipeQuant = new double[] {0.5,0.1,0.1};
		Ginger.isGingerRaw = isGingerRaw;
		Ginger.gingerDrinkType = drinkType;
	}
	Ginger(String name, String drinkType, boolean isGingerRaw, double ing1, double ing2, double ing3) {
		super();
		this.name = name;
		waterLeft = 0;
		ingredients = new String[] {"Ginger","Lemon","Lime"};
		Ginger.isGingerRaw = isGingerRaw;
		Ginger.gingerDrinkType = drinkType;
		recipeQuant = new double[] {ing1,ing2,ing3};
	}
	
	public String getGingerDrinkType() {
		return Ginger.gingerDrinkType;
	}
	
	public boolean isGingerRaw() {
		return isGingerRaw;
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
		
	public double meansOfMixing() {
		waterLeft = getLiquid() - ingSum(recipeQuant);
		System.out.println("result " + waterLeft);
		
		if (waterLeft > 1.0) // checked exception
			throw new NonFormulaException("There's only more water added. No ingredients here.");
		else if (waterLeft < 0.0)
			throw new NonFormulaException("The water is gone.");
		else
			return ingSum(recipeQuant);
	}
	
	@Override
	public String toString() {
		String extra = "Ginger [Name: " + name + " SugarType: " + getSugarType(0) + " Fizz: " + getFizz() + 
				" Ginger Composition: ";
		for (int a = 0; a < ingredients.length; ++a) {
			extra += ingredients[a] + ": " + recipeQuant[a] + " ";
		}
		return extra + getWater() + ": " + (1-ingSum(recipeQuant)) + "]";
	}
	
//	public int compareTo(Ginger e) {
//		return this.getName().compareTo(e.getName());
//	}

}
