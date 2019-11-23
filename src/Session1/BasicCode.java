package Session1;

public class BasicCode {
	
int a = 5;  //Instance variable
int b = 5;

static int c = 10; //class variable
static int d = 11;

static BasicCode bc = new BasicCode();
static BasicCode2 bd2 = new BasicCode2();

	public static void main(String[] args) {
		
		
		
		String colour = "white"; // local variable
		String make = "MS";
		int noofgear = 5;
		String model = "Baleno";
		int yearofmake = 2011;
		double maxspeed = 140.5;
		
	System.out.println(colour);
	System.out.println(c);
	
	System.out.println(bc.b);
	System.out.println(bd2.b);
	
	int added = bd2.add();
	
	int e = added + bc.c;
	System.out.println(e);
	bc.addition();
	bc.sub();
	}
	
	public void addition()
	{
		
		int num1 = 9;
		String hello = "sangeet";
		
		System.out.println("\"hello\"");
		
		System.out.println(c);
		
		System.out.println(a);
	}
	
	public static void sub()
	{
		
		int num1 = 9;
		String hello = "sangeet2o";
		
		System.out.println(hello);
		
		System.out.println(bc.a);
	}

}
