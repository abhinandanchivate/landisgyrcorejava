package com.landysgyr.java8project.samples;

import lombok.Data;

public class BiFunction4 {

	public static void main(String[] args) {
		
		GPS gps =factory("123.123", "123.12344", GPS::new);
		System.out.println(gps);
	}
	
	public static <R extends GPS> R factory(String latitude, String logitude, java.util.function.BiFunction<String, String, R> biFunction) {
		return biFunction.apply(latitude,logitude);
	}
}

@Data
class GPS {
	private String latitude;
	public GPS(String latitude, String logitude) {
		super();
		System.out.println("hello");
		this.latitude = latitude;
		this.logitude = logitude;
	}
	private String logitude;
	
}



