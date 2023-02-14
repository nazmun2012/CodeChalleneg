package codeChallenge;

public class WrappingClass {
	
	 //int a = 10;

	public static void main(String[] args) {
		
		byte b = 5;
		Byte b1 = new Byte(b);
		System.out.print("byte wrapping value is:"+ b1);
		
		byte bv = b1.byteValue();
		System.out.print("byte unwrapping value is:" +bv);
		
		short s = 8;
		Short s1 = new Short(s);
		System.out.print("short wrapping value:" + s1);
		
		short sv = s1.shortValue();
		System.out.print("short unwrapping value:"+ sv);
		
		 int a = 10;
		 Integer a1 = new Integer(a); 
		
		System.out.println("int wrapping value is:" + a1);
		
		int iv = a1.intValue();
		System.out.print("unrapping value :" + iv); 
		
		
	}

}
