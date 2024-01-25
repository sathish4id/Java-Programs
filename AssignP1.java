package com.reva.course;

import java.util.Scanner;

public class AssignP1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name");
		String nameOfPassenger = sc.nextLine();
		
		System.out.println("Enter source");
		String sourceAdd = sc.nextLine();
		
		System.out.println("Enter destination");
		String destAdd = sc.nextLine();
		
		System.out.println("Dear "+nameOfPassenger+", welcome onboard with service from "+sourceAdd+" to "+destAdd+
				". Thank you for choosing Sky Airlines. Enjoy your flight");
	}

}
