package com.landysgyr.java8project.samples;

import java.util.function.Function;

public class FunctionDemo2 {

	public static void main(String[] args) {
		Function<String, Integer> function = x->x.length(); // autoboxing
		// conversion of primitive to Object
		Function<Integer, Integer> function2= x->x*2;
		
		Integer result = function.andThen(function2).apply("abhi");
		//(T t) -> function2.apply(apply(t));
		//(T t) -> function2.apply(4);
		//(T t) -> 8
		// function2apply method will provide the number *2 ka result.
		// function apply will return lenght of string.
		
		System.out.println(result);
		
		
		//a(b("abhi"));
	}
}
