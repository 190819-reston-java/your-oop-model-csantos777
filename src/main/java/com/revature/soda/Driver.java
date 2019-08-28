package com.revature.soda;

public class Driver {

	public static void main(String[] args) {
		SoftDrink a = new Cola();
		SoftDrink b = new Ginger();
		System.out.println(a.toString() + " Fizz? " + a.getFizz());
		System.out.println(b.toString() + " Fizz? " + b.getFizz() + " Is ginger raw? " + ((Ginger)b).isGingerRaw());
	}

}
