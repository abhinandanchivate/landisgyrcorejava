package com.landysgyr.java8project.samples;

import java.util.function.Function;

public class FunctionDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<String, Integer> function = x->x.length(); // autoboxing
		// conversion of primitive to Object
		Integer i =  function.apply("abhi");
		System.out.println(i);
	}

}
