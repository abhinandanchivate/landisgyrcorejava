package com.landysgyr.java8project.samples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Function3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = Arrays.
				asList("abhi","abhinandan","adithya","surbhi","pratham","shivam");
		Function3 function3 = new Function3();
		Map<String, Integer> map =   function3.convertListToMap(list, x->x.length());
		System.out.println(map);
	}
	
	public <T,R> Map<T, R> convertListToMap(List<T> list, Function<T, R> function) {
		Map<T, R> result = new HashMap<>();
		list.forEach(e->result.put(e, function.apply(e)));
		return result;
	}

	public int getLength(String str) {
		return str.length();
	}
}
