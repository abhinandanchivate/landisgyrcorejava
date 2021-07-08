package com.landysgyr.java8project.samples;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Java8BinaryOperator1 {
	
	 public static void main(String[] args) {

	        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	        Integer result = math(Arrays.asList(numbers), 0, (a, b) -> a + b);

	        System.out.println(result); // 55

	        Integer result2 = math(Arrays.asList(numbers), 0, Integer::sum);

	        System.out.println(result2); // 55

	    }

	    public static <T> T math(List<T> list, T init, BinaryOperator<T> accumulator) {
	        T result = init;
	        for (T t : list) {
	            result = accumulator.apply(result, t);
	        }
	        return result;
	    }

//    public static void main(String[] args) {
//
//        // BiFunction
//        BiFunction<Integer, Integer, Integer> func = (x1, x2) -> x1 + x2;
//
//        Integer result = func.apply(2, 3);
//
//        System.out.println(result); // 5
//
//        // BinaryOperator
//        BinaryOperator<Integer> func2 = (x1, x2) -> x1 + x2;
//
//        Integer result2 = func.apply(2, 3);
//
//        System.out.println(result2); // 5
//
//    }

}