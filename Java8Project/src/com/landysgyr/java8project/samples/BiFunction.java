package com.landysgyr.java8project.samples;

import java.util.Arrays;
import java.util.List;

public class BiFunction {

	public static void main(String[] args) {
		java.util.function.BiFunction<Integer, Integer, Integer> biFunction = (x1,x2)->x1+x2;
		Integer result = biFunction.apply(10, 20);
		System.out.println(result);
		   // take two Integers and return an Double
		java.util.function.BiFunction<Integer, Integer, Double> func2 = (x1, x2) -> Math.pow(x1, x2);

        Double result2 = func2.apply(2, 4);

        System.out.println(result2);    // 16.0

        // take two Integers and return a List<Integer>
        java.util.function.BiFunction<Integer, Integer, List<Integer>> func3 = (x1, x2) -> Arrays.asList(x1 + x2);

        List<Integer> result3 = func3.apply(2, 3);

        System.out.println(result3);
	}
}
