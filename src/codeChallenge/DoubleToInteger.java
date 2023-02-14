package codeChallenge;

import java.util.Scanner;

public class DoubleToInteger {

	public static void main(String[] args) {
		
		//Take a double value from user as Input and show it on console as integer
		
		Scanner test = new Scanner(System.in);
		
		System.out.print("Enter a double number:");
		 
		 double number = test.nextDouble();
		
		 int intnumber = (int)number;
		
		 System.out.println("integer number:"+intnumber);
		
		test.close();// garbage collection collect after using object
		
	}

}
