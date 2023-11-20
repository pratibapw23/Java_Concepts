package ShallowCopyExample;

class XYZ{
	int x=40;
}

public class ShallowCopy {

	public static void main(String[] args) {
		
		XYZ obj1=new XYZ();
		
		XYZ obj2=obj1;
		
		obj2.x=3;
		
		System.out.println(obj1.x);
	}

}

/*
 * In the above example we are updating value of x using 
 * reference variable and printing the value of x using original
 * object.
 * It is printing output as 3 because it is updated by object2 and 
 * both object 1 and object 2 are pointing to the same memory location.
 * 
 * That is - changes to one entity reflected in other entities to this is called
 * shallow copy. 
 * */
