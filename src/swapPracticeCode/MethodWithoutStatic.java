package swapPracticeCode;

public class MethodWithoutStatic {

	public static void main(String[] args) {
		
		MethodWithoutStatic value = new MethodWithoutStatic();
		value.swap();	
		value.swap(5,6);
		int result = value.swap1();
		System.out.println("After swapping a value is: "  + "\n After swapping b value is: " + result);
		int result1 = value.swap1();
		System.out.println(result1);
	}
	
	//void without parameter
	
	public  void swap() {
	int a = 2;
	int b = 4;
	System.out.println("Before swapping a value is: " +a + "\n Before swapping b value is: " +b);
	a = a+b;
	b = a-b;
	a = a-b;
	System.out.println("After swapping a value is: " +a + "\n After swapping b value is: " +b);
	
	}
	// void with parameter
		public void swap(int a,int b) {
		System.out.println("Before swapping a value is:" +a + "\n Before swapping b value is: " +b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swapping a value is:" +a + "\n After swapping b value is: " +b);
		
	}
		// return type without parameter
	
	public int swap1() {
		int a = 6;
		int b = 8;
		
		System.out.println("Before swapping a value is: " + a + "\n Before swapping b value is: "+b);
		 a = a+b;
		 b =  a-b;
		 a =  a-b;
		 //System.out.println("After swapping a value is: " + a + "\n After swapping b value is: "+b);
		 
		 return a;
		}
	
			//return type with parameter
		public int swap1(int a, int b) {
			a = 7;
			b = 9;
			System.out.println("Before swapping a value is: " + a + "\n Before swapping b value is: "+b);
			
			a = a+b;
			b = a-b;
			a = a-b;
			
			System.out.println("After swapping a value is: " + a + "\n After swapping b value is: "+b);
			
			return a;
			
			
			
			
		}
}
