package codeChallenge;

import java.util.Scanner;

public class UnaryOperators {

	public static void main(String[] args) {
		
		/*Write a java program to check two integer numbers by using
		  relational operators.	note: Inputs take from keyboard and using 
		  following operators to check them	(==, !=, <,>,<=,>=)*/
		

		Scanner test = new Scanner(System.in);
		
		int num1,num2;
		
		System.out.print("Enter a number1 :");
		num1 = test.nextInt();
		
		System.out.print("Enter a number2 :");
		num2 = test.nextInt();
				
		System.out.println("Equals to :" + (num1 == num2));
		System.out.println("Not equals to :" + (num1 != num2));
		System.out.println("Greater than :" + (num1 > num2));
		System.out.println("less then :" + (num1 < num2));
		System.out.println("Greater than or equals :" + (num1 <= num2));
		System.out.println("less then or equals to :" + (num1 >= num2));
		
	
		
	}

}
