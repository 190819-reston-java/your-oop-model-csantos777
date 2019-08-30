package com.revature.soda;


public abstract class SoftDrink implements Comparable<SoftDrink>{
	
	private String sugarType;
	private final String WATER;
	private final double LIQUID;
	private boolean isCold;
	private boolean doesFizz;
	
	private String name;
	

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
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	protected double ingSum(double[] arr) {
		double result = 0.0;
		for (double e: arr)
			result += e;
		return result;
	}
	
	public abstract String feedback(String shortReview);
	
	public int howToPack(String type) {
		if (type.equals("glass"))
			return 0;
		else
			return 1;
	}
	
	public double getLiquid() {
		return LIQUID;
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
		else
			return 0.0;
	}
	
	public int compareTo(SoftDrink e) {
		return this.getName().compareTo(e.getName());
	}
	
	
	// The point of comparison will be over how much water is left in each drink object.
	
	
}
