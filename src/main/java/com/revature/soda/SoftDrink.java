package com.revature.soda;


public abstract class SoftDrink {
	
	private final String[] sugarType;
	private final double water;
	private boolean isCold;
	
	SoftDrink() {
		super();
		sugarType = new String[]{"Cane Sugar","High Fructose Corn Syrup","Misc"};
		water = 1.0;
		isCold = true;
	}
	
	public abstract double ingredientMixer();
	
	public String getSugarType(int i) {
		return sugarType[i];
	}
	
	public double getWater() {
		return water;
	}
	
	// there are no setter methods because both the water and 
	// the sugar types are constants
	
	public boolean getIsCold() {
		return isCold;
	}
	
	public void setIsCold(boolean isCold) {
		this.isCold = isCold;
	}
	
}
