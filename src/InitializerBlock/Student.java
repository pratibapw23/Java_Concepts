package InitializerBlock;

public class Student {
	
	int id;
	//default constructor:
	
	public Student(){
		System.out.println("ID="+id);
	}
	
	//Initializer block starts:
	
	{
		id=5;
		System.out.println("Initializer block is executed");
	}
	
	//parameterized constructor:
	
	public Student(int id) {
		this.id=id;
		System.out.println(id);
	}
	
	public static void main(String[] args) {

		Student s1=new Student();
		Student s2=new Student(10);
	}

}

/*Calls Initializer block first before the constructor
 * output:
Initializer block is executed
ID=5
Initializer block is executed
10
 */
