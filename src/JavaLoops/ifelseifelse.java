package JavaLoops;

import java.util.Scanner;

public class ifelseifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String gender;
		Scanner SC=new Scanner(System.in);
		System.out.print("Enter Gender (Male/Female/Other): ");
	    gender=SC.next();   // to read the line
		
		//if(gender.equals("Male"))
			if(gender.equalsIgnoreCase("Male"))
		{
			System.out.println("He");
		}
		
		else if(gender.equals("Female"))
		{
			System.out.println("She");
		}
		
		else if(gender.equals("Other"))
		{
			System.out.println("Other");
		}
		else
		{
			System.out.println("Invalid");
		}

	}

}
