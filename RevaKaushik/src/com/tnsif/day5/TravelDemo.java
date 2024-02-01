package com.tnsif.day5;
import java.util.Scanner;

public class TravelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Travel trl= new Travel();
		String name,source,destination;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name");
		name=sc.next();
		System.out.println("Enter the Source");
		source=sc.next();
		System.out.println("Enter the Destination");
		destination=sc.next();
		trl.setName(name);
		trl.setSource(source);
		trl.setDestination(destination);
		
		System.out.println(trl);
		System.out.println("Dear  " + name +", welcome onboard with service  from "+ source +" to "
		+ destination +" .Thank you for choosing Sky Airlines .Enjoy your flight.");

	}

}
