package SortCustomObjectsUsingTreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class Employee{
	int id;
	String name;
	int age;
	
	public Employee(int id, String name, int age) {
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
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}


	public static void main(String[] args) {
		TreeSet<Employee> set=new TreeSet<>(new EmployeeComparator());
		set.add(new Employee(10,"ram",40));
		set.add(new Employee(3,"ram",50));
		set.add(new Employee(4,"ram",90));
		set.add(new Employee(10,"ram2",41));
		set.add(new Employee(2,"neha",20));
		
		System.out.println(set);
	}
}
class EmployeeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return Integer.compare(o1.getId(), o2.getId());
	}
	
}
