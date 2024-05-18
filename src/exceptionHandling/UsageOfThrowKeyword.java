package exceptionHandling;

public class UsageOfThrowKeyword {

	public static void main(String[] args) {
		devideByZero();
	}
	public static void devideByZero() {
		throw new ArithmeticException("Trying to devide by zero");
	}

}
