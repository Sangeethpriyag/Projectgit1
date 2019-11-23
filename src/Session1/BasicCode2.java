package Session1;

public class BasicCode2 {
	
	int a = 5;
	
	int b = 4;
	
	static String name = "John";
	
	public void subtraction()
	{
		int c = a-b;
		
		System.out.println(c);
	}
	
	public int add()
	{
		int c = a+b;
		
		return c;
	}
	
	public static String concat()
	{
		String nam = "Mr." + name;
		
		return nam;
	}
	
	public static void main(String[] args)
	{
		
		BasicCode2 bc2 = new BasicCode2();
		//bc2.subtraction();
		
		System.out.println(bc2.concat());
		
		int d = bc2.add();
		
		int e = d+9;
		
		System.out.println(e);
		
		
		
	}

}
