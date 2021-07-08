package com.landysgyr.java8project.samples;

import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunction2 {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Double> biFunction = (x, y) -> Math.pow(x, y);
		
		Function<Double, String> function = i->"Result :"+String.valueOf(i);
		String result = biFunction.andThen(function).apply(2, 4);
		// return (T t, U u) -> after.apply(apply(t, u));
		//(T t) -> after.apply(apply(t));
		System.out.println(result);
		
	}
}

default <V> BiFunction<T, U, V> andThen(Function<? super R, ? extends V> after) {
    Objects.requireNonNull(after);
    return (T t, U u) -> after.apply(apply(t, u));
                         after.aply(return result of apply(t,u)(bifunction method));
                         after.apply(return 16 )
                         after.apply(16) ==> result : 16
}
