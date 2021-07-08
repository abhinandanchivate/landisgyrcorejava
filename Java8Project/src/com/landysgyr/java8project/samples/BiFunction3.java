package com.landysgyr.java8project.samples;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunction3 {

	public static void main(String[] args) {
		String result = powToString(2, 4, (a1, a2)->Math.pow(a1, a2),r->"result"+String.valueOf(r));
		System.out.println(result);
	}
	
	public static <R> R powToString(Integer a1, Integer a2, java.util.function.BiFunction<Integer,Integer,Double> biFunction, Function<Double, R> function) {
		
		
		return biFunction.andThen(function).apply(a1, a2);
		
	}
}

public static void main(String[] args) {
	BiFunction<Integer, Integer, Double> biFunction = (x, y) -> Math.pow(x, y);
	
	Function<Double, String> function = i->"Result :"+String.valueOf(i);
	String result = biFunction.andThen(function).apply(2, 4);
	// return (T t, U u) -> after.apply(apply(t, u));
	//(T t) -> after.apply(apply(t));
	System.out.println(result);
	
}

