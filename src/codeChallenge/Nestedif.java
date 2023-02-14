package codeChallenge;

import java.util.Scanner;

public class Nestedif {
	// take input of 3 people and determined oldest and youngest person.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int age1 = input.nextInt();
		System.out.print("Enter a number: ");
		int age2 =input.nextInt();
		System.out.print("Enter a number: ");
		int age3 = input.nextInt();
		
		 if ((age1>age2)&&(age1>age3)){
			 			 
			 System.out.println( "age1 is the oldest person ");
		 }
		if((age2>age1)&&age2>age3) {
			System.out.println( "age2 is the oldest person");
		}
		if((age3>age1)&&age3>age2) {
			System.out.println( "age3 is the oldest person");
		}
		if(age1<age2&&age1<age3) {
				System.out.println("age1 the youngest person");
		}
		else {
			System.out.println("Worng");
		}
	}

}
