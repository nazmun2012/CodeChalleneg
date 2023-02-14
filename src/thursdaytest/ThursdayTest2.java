package thursdaytest;

import java.util.Scanner;

public class ThursdayTest2 {

	public static void main(String[] args) {
		/*Write a Java method to compute the sum of the digits in an integer.
		Test Data:
		Input an integer: 25
		Expected Output:
		The sum is 7*/
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = input.nextInt();
		
		int result = sumOfdigit(n);
		System.out.println("The sum of the digits is:"+ result);
		
	}
	
	public static int sumOfdigit(int n) {
		int reminder;
		int sum =0;
		while (n!=0) {
		reminder = n%10;
		sum = sum+reminder;						//sum*10+digit;(it is for reverse)
			n = n/10;
			}
		return sum;
		
	}
}
