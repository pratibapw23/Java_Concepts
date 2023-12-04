package SortCustomObjectsUsingTreeSet;

import java.util.TreeSet;

public class Student implements Comparable<Student>{

	int id;
	String name;
	int age;
	
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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


	public static void main(String[] args) {
		
		TreeSet<Student> set=new TreeSet<>();
		set.add(new Student(10,"ram",40));
		set.add(new Student(3,"ram",50));
		set.add(new Student(4,"ram",90));
		set.add(new Student(2,"neha",20));
		
		System.out.println(set);
	}
	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}


	@Override
	public int compareTo(Student o1) {
		if(this.id>o1.id)
			return 1;
		else
			return -1;
	}

}
