package PolymorphismExample;

public class SuperClass {
	
	public void printHi() {
		System.out.println("hi");
	}
	public void run() {
		
	}

	public static void main(String[] args) {
		SuperClass object=new ChildClassA();
		object.printHi();
		object.run();
		
	}

}
