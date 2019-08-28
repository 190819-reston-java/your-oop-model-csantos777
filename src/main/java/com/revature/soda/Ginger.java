package com.revature.soda;

public class Ginger extends SoftDrink{
		
	private String[] ingredients;
	private double[] quantOfIng;
	
	private static boolean isGingerRaw;
	Ginger() {
		super();
		ingredients = new String[] {"Ginger","Lemon","Lime"};
		quantOfIng = new double[] {0.7,0.4,0.4,getWater()};
		isGingerRaw = true;
	}
		
	public double[] ingredientStmt() {
		quantOfIng[3] = getWater();
		return quantOfIng;
	}
	
	public boolean isGingerRaw() {
		return isGingerRaw;
	}
		
	public String toString() {
		String extra = "Ginger [SugarType: " + getSugarType(0) + " Fizz: " + getFizz() + 
				" Ginger Composition: "; 
		for (int a = 0; a < ingredients.length; ++a) {
			extra += ingredients[a] + ": " + quantOfIng[a] + " ";
		}
		extra += "Water: " + quantOfIng[3];
		return extra + "]";
	}

}
