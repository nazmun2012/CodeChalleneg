package swapPracticeCode;

public class Swap {
	
	/* int a = 5;
	  int b = 10;*/
	
	static int a = 5;
	static int b = 10;

	public static void main(String[] args) {
		//swap two variable using two local variable
		
    	/*int a = 10;
		int b = 5;
		
		a = a+b;// a=15
		b = a-b; // b= 5
		a = a-b;// a = 10
		
		System.out.println("the value of a after swap: " + a + " \n the value of b after swap: " +b); */	// swap with local variable	
		
		/*Swap obj = new Swap();
		obj.a = obj.a + obj.b;
		obj.b = obj.a - obj.b;
		obj.a = obj.a - obj.b;
		
		System.out.println("the value of a after swap: " +obj.a + "\n the value of b after swap: "+obj.b);	// sawp with instance variable */
		
		Swap.a = Swap.a + Swap.b;
		Swap.b = Swap.a - Swap.b;
		Swap.a = Swap.a - Swap.b;
		
System.out.println("the value of a after swap:"+Swap.a +"\n the value of b after swap: "+Swap.b); //swap with static variable
		//System.out.println("a = "+Swap.a +"\n " +"b = " +Swap.b);  


	}

}
