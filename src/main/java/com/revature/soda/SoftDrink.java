package com.revature.soda;


public abstract class SoftDrink implements Production {
	
	private String sugarType;
	private final double WATER;
	private boolean isCold;
	private boolean doesFizz;
	
	SoftDrink() {
		super();
		sugarType = "Cane Sugar";
		WATER = 1.0;
		isCold = true;
		doesFizz = true;
	}
	
	SoftDrink(String sugar) {
		this.sugarType = sugar;
		WATER = 1.0;
	}
	
	public abstract double[] ingredientStmt();
	
	public int howToPack(String type) {
		if (type.equals("glass"))
			return 0;
		else
			return 1;
	}
	
	public String getSugarType(int i) {
		return sugarType;
	}
	
	public boolean getFizz() {
		return doesFizz;
	}
	
	public double getWater() {
		return WATER;
	}
	
	// there are no setter methods because both the water and 
	// the sugar types are constants
	
	public boolean getIsCold() {
		return isCold;
	}
	
	public void setIsCold(boolean isCold) {
		this.isCold = isCold;
	}
	
	public String toString() {
		return "SoftDrink [" + sugarType + "," + isCold + ",Water=" + WATER + "]"; 
	}
	
	public boolean waterIsPure() {
		return true;
	}
	
	public boolean carbonation() {
		return true;
	}
	
	
}
