package equalityChecksInJava;

import java.util.Objects;

public class Student {

	String name;
	
	public Student(String name) {
		this.name=name;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name);
	}



	public static void main(String[] args) {
		Student s1=new Student("ram"); //1234
		Student s2=new Student("ram"); //4567
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2); //compares the memory locations
	}

}
