package com.landysgyr.java8project.samples;

import java.util.function.Function;

public class FunctionDemo2 {

	public static void main(String[] args) {
		Function<String, Integer> function = x->x.length(); // autoboxing
		// conversion of primitive to Object
		Function<Integer, Integer> function2= x->x*2;
		
		Integer result = function.andThen(function2).apply("abhi");
		System.out.println(result);
		
		
		//a(b("abhi"));
	}
}
