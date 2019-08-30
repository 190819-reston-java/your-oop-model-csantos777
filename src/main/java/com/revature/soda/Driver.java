package com.revature.soda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.Set;

public class Driver {

	public static void main(String[] args) {
		Cola a = new Cola();
		Ginger b = new Ginger();
		System.out.println(a.toString() + " Fizz? " + a.getFizz());
		System.out.println(b.toString() + " Fizz? " + b.getFizz() + " Is ginger raw? " + (b.isGingerRaw()));
		
		System.out.println("Is liquid? " +
				"\nWhat kind of Ginger drink is this? " + b.getGingerDrinkType());
		
		
		Ginger ba = new Ginger("Q","Beer", true, 0.2,0.1,0.2);
		System.out.println(ba);
		Cola ab = new Cola("Q",0.1,0.1,0.4);
		System.out.println(ab);
		
		List<SoftDrink> softDrinkList = new ArrayList<SoftDrink>();
		softDrinkList.add(a);
		softDrinkList.add(b);
		softDrinkList.add(ab);
		softDrinkList.add(ba);
		
		System.out.println(softDrinkList);
		//Set<SoftDrink> sortedSDL = new TreeSet<SoftDrink>(softDrinkList);
		//Collections.sort(softDrinkList);
		
		SoftDrink[] softDrinkArr = softDrinkList.toArray(new SoftDrink[softDrinkList.size()]);
		
		for (int c = 0; c  < softDrinkArr.length; ++c)
			softDrinkArr[c] = softDrinkList.get(c);
			
		Arrays.sort(softDrinkArr);
		
		for (SoftDrink e : softDrinkArr)
			System.out.println("sortedSDL: " + e);
		
		
		
		
	}

}
