package codeChallenge;

import java.util.Scanner;

public class Test3 {
	
	public static void main(String[] args) {
		
		;
		/*Create a class named 'Rectangle' with two data members- length and width and a method to claculate the area which 
		 is 'length*w’idth. The class has three constructors which are :
	1 - having no parameter - values of both length and width are assigned zero.
	2 - having two numbers as parameters - the two numbers are assigned as length and width respectively.
	3 - having one number as parameter - both length and width are assigned that number.*/
		/*
		 /* Write a method named isEven that accepts an int argument. The method should return true if the
		 *  argument is even, or false otherwise. Also write a program to test your method.
		 */

		/*Write a Java program that accepts three numbers and prints "All numbers are equal" if all three numbers are equal, 
		 * "All numbers are different" if all three numbers are different and "Neither all are equal or different" otherwise.
		Test Data
		Input first number: 2564
		Input second number: 3526 
		Input third number: 2456
		Expected Output :

		All numbers are different*/
		
		/*Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1 = input.nextInt();
		System.out.print("Enter Second number: ");
		int num2 = input.nextInt();
		System.out.print("Enter third number: ");
		int num3 = input.nextInt();
		
		if(num1 == num2 && num1 ==num3) {
			System.out.println("All number are equal.");
		}
		else if(num1 == num2 || num1 ==num3 || num2==num3) {
			System.out.println("Neither all are equal or differnt.");
		}
		
		else {
			System.out.println("All numbers are differnt");
		}*/
		
	/*	Write a Java program to find a missing number in an array. For example: int a[] = new int [] {1,2,4,5},
	 *  here missing number is 3.*/
	/*	int a[] = new int [] {1,2,4,5};
	
		int n= a.length +1;
		int sum = (n*(n+1))/2;
		for(int i =0; i<a.length; i++) {
			sum = sum-a[i];
		}System.out.println(sum);*/
		
		int[][] a2D = new int [][]{{1,2,3},{6, 7, 8, 8}};
		
		
		/*for(int i = 0; i<a2D.length; i++) {
			for(int j=0; j<a2D[i].length; j++) {
				System.out.print("");
				
				System.out.print(a2D[i][j]+ " ");
							
				}System.out.println();*/
		
		int[] a = {1, 2, 3, 4};
		int sum=0;
		double avg=0;
		
		for(int i =0; i<a.length;i++) {
			sum = sum + a[i];
			avg = sum/a.length;
			
		}System.out.println(avg);
		
		
			}
			
		}
	  


