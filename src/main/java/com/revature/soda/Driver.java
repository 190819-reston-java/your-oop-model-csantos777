package com.revature.soda;

public class Driver {

	public static void main(String[] args) {
		Cola a = new Cola();
		Ginger b = new Ginger();
		System.out.println(a.toString() + " Fizz? " + a.getFizz());
		System.out.println(b.toString() + " Fizz? " + b.getFizz() + " Is ginger raw? " + (b.isGingerRaw()));
		
		System.out.println("Is liquid? " + b.isValidGingerDrink());
	}

}
