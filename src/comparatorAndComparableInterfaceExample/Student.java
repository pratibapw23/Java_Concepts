package comparatorAndComparableInterfaceExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student {

	int id;
	String name;
	int age;
	
	public Student(int id, String name, int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	
	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}


	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<>();
		list.add(new Student(1,"ram",20));
		list.add(new Student(2,"neha",10));
		list.add(new Student(3,"mayuri",25));
		list.add(new Student(4,"diksha",30));
		System.out.println("Before Sorting");
		System.out.println(list);
		Collections.sort(list, new StudentComparator());
		System.out.println("After Sorting");
		System.out.println(list);
	}

}
class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student obj1, Student obj2) {
		return obj1.getAge()-obj2.getAge();
	}
	
}
