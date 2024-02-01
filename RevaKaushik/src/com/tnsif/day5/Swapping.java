package com.tnsif.day5;
import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a :");
		a =sc.nextInt();
		System.out.println("Enter b :");
		b =sc.nextInt();
		
		System.out.println(" numbers before swapping :"+ a +" and "+ b +"");
		
		 a=a^b;
		 b=a^b;
		 a=a^b;
		System.out.println(" numbers after swapping :"+ a +" and "+ b +"");

		// TODO Auto-generated method stub

	}

}
