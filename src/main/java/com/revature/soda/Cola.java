package com.revature.soda;

public class Cola extends SoftDrink {
	
	private String[] ingredients;
	private double[] quantOfIng;
	Cola() {
		super();
		ingredients = new String[] {"Caramel","Cola Nut","Vanilla"};
		quantOfIng = new double[] {0.5,0.75,0.4,getWater()};
	}
	
	public double[] ingredientStmt() {
		quantOfIng[3] = getWater();
		return quantOfIng;
	}
	
	public String toString() {
		String extra = "Cola [SugarType: " + getSugarType(0) + " Fizz: " + getFizz() + 
				" Cola Composition: "; 
		for (int a = 0; a < ingredients.length; ++a) {
			extra += ingredients[a] + ": " + quantOfIng[a] + " ";
		}
		extra += "Water: " + quantOfIng[3];
		return extra + "]";
	}

}
