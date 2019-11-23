package JavaLoops;

import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String gender;
		Scanner SC=new Scanner(System.in);
		System.out.print("Enter Gender (Male/Female/Other): ");
	    gender=SC.next();
	    
	    switch (gender) {
	    
		case "Male":
			System.out.println("He");
			break;
		
		case "Female":
			System.out.println("She");
			break;
			
		case "Other":
			System.out.println("Other");
			break;
			
		default:
			System.out.println("Invalid");
			break;
		}
	    
	    System.out.println(1);
	    System.out.println(2);
	    System.out.println(3);
	    System.out.println(4);
	    System.out.println(5);
	    
	}

}
