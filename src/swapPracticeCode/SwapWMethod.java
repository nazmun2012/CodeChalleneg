package swapPracticeCode;

public class SwapWMethod {

	public static void main(String[] args) {
		
		swapMethod();
		swapMethod1(12, 24);
		int result = swapMethod2();
		System.out.println(result);
		int result1 = swapMethod3(30,40);
		System.out.println(result1);
		
	}
	// void without parameter
	public static void swapMethod() {
		int a = 10;
		int b = 5;
		int c;
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("1. value of a after swap : " + a + "\n 2. value of b after swap: " + b);
				
	}
		//void with perameter
		public static void swapMethod1(int a, int b) {
			
		System.out.println("Before swapping a :" + a + "\n Before swapping b: " +b);
		
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println("3. After swapping a: " +a + "\n 4. After swapping b: " +b);
			
	}
		// return without parameter
		public static int swapMethod2() {
			
			int a = 15;
			int b = 20;
			int c;
			//System.out.println("before swapping a : " +a + " \n before swapping b : " +b);
			c = a;
			a = b;
			b =c;
			System.out.println("5. after swapping a : " +a + " \n 6. after swapping b : " +b);
			return c;
			
		}
		// return with parameter
		public static int swapMethod3(int a, int b) {
			
			System.out.println("before swapping a : " +a + " \n before swapping b : " +b);
			
			int c;
			c = a;
			a = b;
			b = c;
			
			System.out.println("7. after swapping a : " +a + " \n 8. after swapping b : " +b);
			return c;
			
			
			
		}
}
 
