package assessment;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0;
		int b = 1;
		
		{
			
		System.out.println(a);
		System.out.println(b);
		
				
		} 
	for(int i = 1; i<19; i++ )
	{
		int c = a + b;
		a = b;
		b = c;
		System.out.println(c);
	}

}
}
