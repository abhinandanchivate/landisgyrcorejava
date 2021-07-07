package com.landysgyr.java8project.samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import org.apache.commons.codec.cli.Digest;
import org.apache.commons.codec.digest.DigestUtils;

public class Function4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = Arrays.
				asList("abhi","abhinandan","adithya","surbhi","pratham","shivam");
		Function4 function4 = new Function4();
		List<String> map =   function4.convertListToMap(list,x->function4.sha256(x) );
		System.out.println(map);
	}
	
	public <T,R> List< R> convertListToMap(List<T> list, Function<T, R> function) {
		List<R> result = new ArrayList<>();
		list.forEach(e->result.add(function.apply(e)));
		return result;
	}

	public String sha256(String str) {
		return DigestUtils.sha256Hex(str);
	}
}
