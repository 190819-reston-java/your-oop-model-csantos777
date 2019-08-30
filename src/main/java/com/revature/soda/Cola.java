package com.revature.soda;

public class Cola extends SoftDrink implements Production {
	
	private String name;
	private String[] ingredients;
	private double[] recipeQuant;
	private double waterLeft;
	Cola() {
		super();
		name = "Generic";
		ingredients = new String[] {"Caramel","Cola Nut","Vanilla"};
		recipeQuant = new double[] {0.3,0.4,0.1};
	}
	Cola(String name, double ing1, double ing2, double ing3) {
		super();
		this.name = name;
		ingredients = new String[] {"Caramel","Cola Nut","Vanilla"};
		
		recipeQuant = new double[] {ing1,ing2,ing3};
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
	
	public double meansOfMixing() {
		waterLeft = getLiquid() - ingSum(recipeQuant);
		System.out.println("result " + waterLeft);
		
		if (waterLeft > 1.0) // unchecked exception
			throw new NonFormulaException("There's only more water added. No ingredients here.");
		else if (waterLeft < 0.0)
			throw new NonFormulaException("The water is gone.");
		else
			return ingSum(recipeQuant);
	}
	
	@Override
	public String toString() {
		String extra = "Cola [Name: " + name + " SugarType: " + getSugarType(0) + " Fizz: " + getFizz() + 
				" Cola Composition: "; 
		for (int a = 0; a < ingredients.length; ++a) {
			extra += ingredients[a] + ": " + recipeQuant[a] + " ";
		}
		return extra + getWater() + ": " + (1-ingSum(recipeQuant)) + "]";
	}
	
//	public int compareTo(Cola e) {
//		return this.getName().compareTo(e.getName());
//	}

}
