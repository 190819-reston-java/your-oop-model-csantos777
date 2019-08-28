package com.revature.soda;


public abstract class SoftDrink {
	
	private final String SUGAR_TYPE;
	private final double WATER;
	private boolean isCold;
	
	SoftDrink() {
		super();
		SUGAR_TYPE = "Cane Sugar";
		WATER = 1.0;
		isCold = true;
	}
	
	public abstract double[] ingredientStmt();
	
	public String getSugarType(int i) {
		return SUGAR_TYPE;
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
		return "SoftDrink [" + SUGAR_TYPE + "," + isCold + ",Water=" + WATER + "]"; 
	}
	
}
