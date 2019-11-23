package Session1;

public class Calculator {
	
	static int a = 4;  //class
	int b = 5;  //instance

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArithmeticOps ops = new ArithmeticOps();
		
		ops.add(7, 5);
		ops.add(1000, 1020);
		ops.add(2 , 8);
		ops.add(7,  70012);
		
		ops.mul(7, 5);
		ops.mul(1000, 1020);
		ops.mul(2,  8);
		ops.mul(7,  70012);
		int c = ops.mul(7, 5) * ops.mul(7, 5);
		System.out.println(c);
		
	}

}
