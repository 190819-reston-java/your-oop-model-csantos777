package com.revature.soda;

public class Driver {

	public static void main(String[] args) {
		SoftDrink a = new Cola();
		System.out.println(a.toString() + "Fizz? " + a.getFizz());
	}

}
