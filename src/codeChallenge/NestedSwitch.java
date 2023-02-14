package codeChallenge;

public class NestedSwitch {

	public static void main(String[] args) {
		String branch = "CSE";
		int year =2;
		switch(year) {
		case 1:
			System.out.println("elective course: Advance English, Algebra");
			break;
		case 2:
			switch(branch) {
			case "CSE":
			case "CCE":
				System.out.println("elective courses: Machine Learning, Big Data");
				break;
			case "ECE":
				System.out.println("elective courses: Antenna Engineering");
				break;
				default:
					System.out.println("Elective courses: Optimization");}
			
			
			}
		}

	}



