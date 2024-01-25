package com.reva.course;
import java.util.Scanner;

public class AssignP2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers");
		int ftNum = sc.nextInt();
		int scNum = sc.nextInt();
		int tdNum = sc.nextInt();
		
		if(ftNum == scNum && scNum == tdNum) {
			System.out.println("Numbers are equal");
		}
		else if(ftNum < scNum && ftNum < tdNum) {
			System.out.println("smallest number is "+ftNum);
		}
		else if(scNum < ftNum && scNum < tdNum) {
			System.out.println("smallest number is "+scNum);
		}
		else if(tdNum < ftNum && tdNum < scNum) {
			System.out.println("smallest number is "+tdNum);
		}
		else {
			System.out.println("Enter correct input");
		}
	}

}
