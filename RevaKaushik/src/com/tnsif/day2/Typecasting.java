package com.tnsif.day2;

public class Typecasting {

	public static void main(String[] args) {
		//IMplicit Type casting also called as widening
		float f =45.4f;
		double d = f;
		System.out.println(d);
		
		int i = 45;
		float a = i;
		System.out.println(a);
		
		char c = 'K';
		int b = c;
		System.out.println(b);
		
		//Explisit type casting
		double d2=10.6899999999d;
		float f2 = (float) d2;
		System.out.println(f2);
		
		float f3 = 45.6f;
		int s = (int) f3;
		System.out.println(s);
		
		int i2 = 54;
		char c2= (char) i2;
		System.out.println(c2);
	}

}
