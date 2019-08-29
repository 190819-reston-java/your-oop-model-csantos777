package com.revature.soda;


public abstract class SoftDrink implements Production {
	
	private String sugarType;
	private final String WATER;
	private final double LIQUID;
	private boolean isCold;
	private boolean doesFizz;
	
	SoftDrink() {
		super();
		WATER = "Water";
		sugarType = "Cane Sugar";
		LIQUID = 1.0;
		isCold = true;
		doesFizz = true;
	}
	
	SoftDrink(String sugar) {
		this.sugarType = sugar;
		LIQUID = 1.0;
		WATER = "Water";
	}
	
	protected boolean isValidLiquid(double[] ingrdt) {
		double result = 0;
		for (double a : ingrdt) {
			result += a;
		}
		if (result == LIQUID) 
			return true;
		else
			return false;
	}
	
	public abstract String feedback(String shortReview);
	
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
	
	public String getWater() {
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
		return "SoftDrink [" + sugarType + "," + isCold + ",Water=" + LIQUID + "]"; 
	}
	
	public boolean waterIsPure() {
		return true;
	}
	
	public double carbonation(String type) {
		if (type.equals("CO2") || type.equalsIgnoreCase("Carbon Dioxide"))
			return 0.25;
		else if (type.equalsIgnoreCase("Citric Acid"))
			return 0.125;
		else
			return 0.0;
	}
	
	
}
