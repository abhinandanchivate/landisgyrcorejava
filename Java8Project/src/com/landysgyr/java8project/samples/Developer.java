package com.landysgyr.java8project.samples;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

import lombok.Data;

@Data
public class Developer {
	
	public static void main(String[] args) {
		  Developer dev1 = new Developer("jordan", BigDecimal.valueOf(9999));
	        Developer dev2 = new Developer("jack", BigDecimal.valueOf(8888));
	        Developer dev3 = new Developer("jaden", BigDecimal.valueOf(10000));
	        Developer dev4 = new Developer("ali", BigDecimal.valueOf(2000));
	        Developer dev5 = new Developer("abhi", BigDecimal.valueOf(1	));
	        List<Developer> developers = Arrays.asList(dev1,dev2,dev3,dev4,dev5);
	        
	        Comparator<Developer> comparing = Comparator.comparing(Developer::getSalary);
	        
	        BinaryOperator<Developer> binaryOperator = BinaryOperator.minBy(Comparator.comparing(Developer::getSalary));
	 
	        Developer resDeveloper = find(developers, binaryOperator);
	        System.out.println(resDeveloper);
	}
	
	public static Developer find(List<Developer> list, BinaryOperator<Developer> binaryOperator) {
	
		Developer result = null;
		for (Developer developer : list) {
			if(result==null) {
				result = developer;
			}
			else {
				result =binaryOperator.apply(result, developer);
			}
		}
		return result;
		
	}

    String name;
    BigDecimal salary;

    public Developer(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
    }

    //...
}