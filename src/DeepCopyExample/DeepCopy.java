package DeepCopyExample;

class ABC{
	int x=60;
}

public class DeepCopy {

	public static void main(String[] args) {
		
		ABC obj1=new ABC();
		
		ABC obj2=new ABC();
		
		obj2.x=5;
		
		System.out.println(obj1.x);

	}

}
/*
 * In this example, we are changing value of x using reference variable 
 * obj2, and printing value of x using reference variable obj1.
 * It will display in output as 60 as the original value because
 * obj1 and obj2 are pointing to the different memory locations.
 * Hence if we make changes in one entity that does not reflected in 
 * other entities this is called deep copy.
 */
