package codeChallenge;

public class Book {
	
	String title;
    String author;
	double price;
   

Book(String t,String a,double p){
 	title = t;
 	author = a;
 	price = p;
	
	}
	
		void display(){ 
		System.out.println(title+ " "+ author +" " + price);
	}
	
		public static void main(String[] args) {
		/*Write a Java class Book with following features:
			Instance variables :
			title for the title of book of type String.
			author for the author’s name of type String.
			price for the book price of type double.
			Constructor:
			Book (String title, Author name, double price):
			A constructor with parameters, it creates the Author object by setting the the 
			fields to the passed values.
			Creating a user defined method to display following book information
			a Book titled “Developing Java Software” with authors Russel Winderand 
			price 79.75. Prints the Book’s info to standard output (using System.out.println).*/

		Book obj = new Book( "Developing Java Software","\n " +"Russel Winderand", 79.75);
		obj.display();
		
	}

}
