package com.reva.course;
import java.util.Scanner;

public class AssignP3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number, a = ");
		float fstNum = sc.nextFloat();
		
		System.out.println();
		
		System.out.print("Enter another number, b = ");
		float sndNum = sc.nextFloat();
		
		float temp = 0;
		
		temp = fstNum;
		fstNum = sndNum;
		sndNum= temp;
		
		System.out.print("Swapped number, a = "+fstNum);
	
		System.out.print("Swapped number, b = "+sndNum);
	}

}
