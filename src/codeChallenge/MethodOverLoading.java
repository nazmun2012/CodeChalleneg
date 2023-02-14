package codeChallenge;

public class MethodOverLoading {

	public static void main(String[] args) {

 /*write a jav a program to calculate the area of triangle 
		using overloading method*/
		/*note: overloading 
		no return type with parameter ( 2 double parameter)
		 return type with parameter (int(base), double(hight))*/
		
		MethodOverLoading number = new MethodOverLoading();
		double area = number.triangle();
		System.out.println( "the are of tringle" +area);
		
		number.triangle(10,20);

	}
	
	//return type without parameter
	double triangle() {
		double base, hight, area;
		base = 5.50;
		hight = 2.0;
		area = (base * hight)/2;
		return area;
	}

	//return type with parameter
	
	void triangle(int base, double hight) {
		
		double area;
		area = (base*hight)/2;
		System.out.println("the area of triangle "+area);
		
	
		
	}
	
	
	
}
