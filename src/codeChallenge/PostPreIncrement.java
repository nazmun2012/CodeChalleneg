package codeChallenge;

import java.util.Scanner;

public class PostPreIncrement {

	public static void main(String[] args) {

		 /*Take a number as input from user and show/display their operation by following....
		  Pre ++
		  post ++
		  pre --
		  post --*/
		
		Scanner input = new Scanner (System.in);
	
		System.out.print("Enter a number :");
		int a = input.nextInt();
		
		
		//System.out.println("Enter pre increment number:" + (++a));
		//System.out.println("Enter post increment number:" +(a++));
		System.out.println("Enter pre decrement number:" +(--a));
		 System.out.println("Enter post decrement number:" + (a--));
		 
		 
		input.close();// garbage collection 
		 
	}

}
