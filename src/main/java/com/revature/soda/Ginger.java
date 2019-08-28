package com.revature.soda;

public class Ginger extends SoftDrink{
		
	private String[] ingredients;
	private double[] quantOfIng;
	
	private static boolean isGingerRaw;
	private static String gingerDrinkType;
	Ginger() {
		super();
		ingredients = new String[] {"Ginger","Lemon","Lime",getWater()};
		quantOfIng = new double[] {0.5,0.1,0.1,0.3};
		isGingerRaw = true;
	}
	Ginger(String drinkType, boolean gingerFresh) {
		super();
		ingredients = new String[] {"Ginger","Lemon","Lime",getWater()};
		quantOfIng = new double[] {0.5,0.1,0.1,0.3};
		isGingerRaw = gingerFresh;
		this.gingerDrinkType = drinkType;
	}
	
	public boolean isGingerRaw() {
		return isGingerRaw;
	}
	
	public boolean isValidGingerDrink() {
		return isValidLiquid(quantOfIng);
	}
	
	public String feedback(String shortReview) {
		return shortReview;
	}
		
	@Override
	public String toString() {
		String extra = "Ginger [SugarType: " + getSugarType(0) + " Fizz: " + getFizz() + 
				" Ginger Composition: "; 
		for (int a = 0; a < ingredients.length; ++a) {
			extra += ingredients[a] + ": " + quantOfIng[a] + " ";
		}
		return extra + "]";
	}

}
