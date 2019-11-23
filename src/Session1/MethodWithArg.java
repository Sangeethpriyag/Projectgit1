package Session1;

public class MethodWithArg {
	
	public static void addition(int a, int b)
	{
		int c = a+b;
		System.out.println(c);
	}
	
	public static void NamePrint(String c)
	{
			System.out.println(c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodWithArg arg = new MethodWithArg();
		arg.addition(2,3);
		arg.NamePrint("Test");
		

	}

}
