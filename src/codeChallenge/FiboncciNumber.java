package codeChallenge;

public class FiboncciNumber {

	public static void main(String[] args) {
		//write a java program for the fibonacci series
		
		// 0, 1, 1, 2, 3, 5, 8, 13
		// 0+1=1
		//	1+1=2
		
	/*	int firstNum =0;
		int secondNum =1;
		int n=10;
		int fibo ;
		System.out.println("Fiboncci numbers:");
		for (int i =0; i<=n; i++) {
			fibo = firstNum + secondNum;
			System.out.println(fibo);
			firstNum = secondNum;
			secondNum = fibo;
		
		} System.out.println();
	
		int a=0;
		int b=1;
		
		int num=10;
		
		for(int i= 0; i<=num; i++) {
			int c=a+b; 
			a=b;
			b=c;
			
			System.out.println(c);
		
		//farhenhight*/
		
		String s = "java";
		int len = s.length();
		String reverse ="";
		
		for(int i = len-1; i>=0; i--) {
			reverse = reverse + s.charAt(i);
					
		}System.out.println(reverse);
		
		
		
	}
}
