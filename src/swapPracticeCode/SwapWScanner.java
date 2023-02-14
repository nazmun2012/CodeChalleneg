package swapPracticeCode;

import java.util.Scanner;

public class SwapWScanner {

	public static void main(String[] args) {
		
		int z;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter value for x : ");
	
		int x = scan.nextInt();
		 System.out.print("Enter value for y : ");
		int y = scan.nextInt();
		 
		 System.out.println("Before swap value for x, y : " + x + " " +y);
		 
		 //swapping
		 z = x;
		 x = y;
		 y = z;
		 
		 System.out.println("After swapping value for x, y : " + x + " " +y);
		 
		scan.close();
	}

}
