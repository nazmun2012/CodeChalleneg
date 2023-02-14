package test;

import java.util.Scanner;

public class Solve {
	public void swaping(int a, int b) {
		System.out.println("Before swaping a value is : " + a +" "+ "Before swaping b value is : "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swaping a value is : " + a +" "+ "After swaping b value is : "+b);
	}
	
/*	public static boolean isEven(int even) {
		
		boolean b= even%2==0;
		return b;     
		
	}*/
	
	public static int digit(int num) {
// int reverse=0;
		int sum=0;
	while(num>0) {
		int reminder = num % 10; 
//reverse=reverse*10+reminder;
		sum=sum+reminder;
		num = num/10;
		
		}
//	return reverse;
return sum;
	}
	
	public static void main(String[] args) {
		
System.out.println(digit(25));
	//	System.out.println(isEven(4));

	Solve obj = new Solve();
	obj.swaping(1, 2);
		
	//	swaping(10,20);

		/*Scanner input = new Scanner(System.in);
		System.out.print("Enter year: ");
		 int year = input.nextInt();
		
		System.out.println(leapYear(year));
	;
	}
		public static boolean leapYear(int y) {
		boolean a = y % 4==0 ; {
			return a;
		 }*/
		 

		}
}
