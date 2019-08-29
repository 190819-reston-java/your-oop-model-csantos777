package com.revature.soda;

public class Driver {

	public static void main(String[] args) {
		Cola a = new Cola();
		Ginger b = new Ginger();
		System.out.println(a.toString() + " Fizz? " + a.getFizz());
		System.out.println(b.toString() + " Fizz? " + b.getFizz() + " Is ginger raw? " + (b.isGingerRaw()));
		
		System.out.println("Is liquid? " + b.isValidGingerDrink() +
				"\nWhat kind of Ginger drink is this? " + b.getGingerDrinkType());
		
		
		Ginger ba = new Ginger("Ginger Beer", true, 0.2,0.1,0.1,0.6);
		System.out.println(ba);
		Cola ab = new Cola(0.2,0.1,0.1,0.6);
		System.out.println(ab);
	}

}
