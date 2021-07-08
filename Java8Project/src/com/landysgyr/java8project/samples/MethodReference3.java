package com.landysgyr.java8project.samples;

import java.util.function.BiFunction;  
class Arithmetic{  
public static int add(int a, int b){  
return a+b;  
}  
}  
public class MethodReference3 {  
public static void main(String[] args) {  
BiFunction<Integer, Integer, Integer>adder = Arithmetic::add;  // (a,b)->Arithmetic.add(a,b);
int result = adder.apply(10, 20);  
System.out.println(result);  
}  
}  