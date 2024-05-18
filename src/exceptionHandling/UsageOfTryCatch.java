package exceptionHandling;

public class UsageOfTryCatch {

	public static void main(String[] args) {
		try {
			//code that will generate exception
			int devideByZero=10/0;
			System.out.println("Rest of the code");
		}catch(ArithmeticException e) {
			System.out.println("ArithmaticException->"+e.getMessage());
		}finally {
			System.out.println("Finally block-Always executed");
		}
	}

}
