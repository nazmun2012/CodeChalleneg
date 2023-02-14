package codeChallenge;

import java.util.Scanner;

public class Casting {

	public static void main(String[] args) {
		//Take a double value from user as Input and show it on console as integer
		//solution: find out the variable,variable type,way of problem solving(logical part), how to show output
		/*Write a Java program that reads a number in inches as double data, converts it to meters as integer.
		Note: One inch is 0.0254 meter.*/
		/*solution:find out the variable, variable type, way of problem solving(logical part), 
		 * convert to integer*/
		//1.write a java program to convert minutes into a number of years and days
		 /*
		 
		/*2.Write a java program to compute body mass index(BMI).
		 *test data: input weight in pounds:452, input height in inchs:72, 
		 * Expected Output: Body Mass index is 61.30159143458721
		 */
		//Solution
		/* take 1 int value for weight, 1 int value for height variables, 
		 * and 1 is double for index to show value in the console,
		 * find the value for pound and inch and calculate weight and height values
		 * find the value for bmi
		 */
		/* 3.Write a java program that accepts two intergers from the user and 
			then prints the sum, the difference, the product,the average, 
			the distance(the difference between integer),
			the maximum(the larger of the two integers)
			the minimum(smaller of the two integers)*/
		// 4. Write a java program to divide two numbers as float and print on the screen as integer
		// 5. Write a java program swap two variables without using third variable
	
		Scanner input = new Scanner(System.in);
		/*System.out.print("Enter double value: ");
		double dvl = input.nextDouble();
		int ivl = (int)dvl;
		System.out.println("Show int value: "+ivl);*/
		
		/*System.out.print("Enter double value: ");
		double inch = input.nextDouble();
		int meter = (int) (inch*0.0254);
		System.out.println("convert value: "+meter);*/
		
		//problem solution # 1
		System.out.print("Enter minute: ");
		int min = input.nextInt();
		
		int years = min/(60*24*365);
		int days = min/(60*24);
		System.out.println(min + " minutes is "+ years + " years and " + days +" days");
		
		
		//problem solution # 2
	/*	System.out.print("Enter weight: ");
		double weight = input.nextInt();
		System.out.print("Enter height: ");
		double height = input.nextInt();
		
		double kilo_per_pound =0.45359237; //Constant
		double meter_per_inch = 0.0254; //Constant
		
		double weight_in_kilo = weight*0.45359237;
		double height_in_inch = height*0.0254;
		
		double bmi = weight_in_kilo/(height_in_inch*height_in_inch);
		
		System.out.println(bmi);*/
		
		//problem solution # 3
		/*System.out.print("Enter a num1: ");
		int a = input.nextInt();
		System.out.print("Enter a num2: ");
		int b = input.nextInt();
		int sum = a+b;
		System.out.println("Sum:" + sum);
		int difference = a-b;
		System.out.println("Difference: "+difference);
		int product = a*b;
		System.out.println("product: "+product);
		int average = (a+b)/2;
		System.out.println("average: "+average);
		int distance = a-b;
		System.out.println("distance: "+distance);
		int max_num	= (a>b)?a:b;
		System.out.println("max_num: "+max_num);
		int min_num	= (a<b)?a:b;
		System.out.println("min_num: "+min_num);*/
		
		
		//problem solution # 4
	/*	System.out.print("Enter a num1: ");
		float num_1 = input.nextFloat();
		System.out.print("Enter a num2: ");
		float num_2 = input.nextFloat();
		
		int value = (int) (num_1/num_2);
		System.out.println("floating value show as integer in sceen: "+ value);*/
		
		//problem solution # 5
		/*System.out.print("Enter a num1: ");
		int a = input.nextInt();
		System.out.print("Enter a num2: ");
		int b = input.nextInt();
		
		System.out.println("Before swapping a value is: "+ a + "\n"+ "Before swapping b value is: " +b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping a value is: "+ a+"(b)" +  "\n" +"After swapping b value is: " +b+"(a)");*/
	
	input.close();
	}

}
