package test;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		/* Write a Java method to find the smallest number among three numbers.
		Test Data:
			Input the first number: 25
			Input the Second number: 37
			Input the third number: 29
			Expected Output:

			The smallest value is 25.0*/
		double	smallestnumber;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number: ");
		double num1 = scan.nextDouble();
		System.out.print("Enter second number: ");
		double num2 = scan.nextDouble();
		System.out.print("Enter second number: ");
		double num3 = scan.nextDouble();
		
		double value = smallestnumber(num1,num2,num3);
		System.out.println(" Smallest number is : " + value);
		
		}
	public static double smallestnumber( double num1, double num2, double num3) {
		if (num1>num2 && num1>num3) 
			System.out.println("num1 smallest number");
		else if (num2>num1 && num2>num3)
			System.out.println("num1 smallest number");
		else if (num3>num1 && num3>num1)
			System.out.println("num1 smallest number");
		return smallestnumber (num1,num2,num3);
		
	}
}