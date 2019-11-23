package assessment;

import java.util.Scanner;

public class muloftwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input;
		Scanner SC=new Scanner(System.in);
		System.out.print("Enter input: ");
		int num = SC.nextInt();
		
	    for(input = 2; input<(num*11); input = input + num)
	    {
	    	System.out.println(input);
	    }
	    
	    /*
	     int num =;
	     for(int i = 1; i < 10; i ++)
	     {
	     int d = i * num;
	     System.out.println(d);
	     }
	     */
	}

}
