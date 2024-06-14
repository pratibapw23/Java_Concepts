package comparatorAndComparableExamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparator<Employee>{
	int age;
	String name;
	
	public Employee() {
		
	}
	public Employee(int age, String name) {
		this.age=age;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Employee{"
				+ "name="+name+", "
				+ "age="+age+"}";
	}
	
	@Override
	public int compare(Employee s1, Employee s2) {
		return s2.age-s1.age;
	}
}
public class SortStudentsObjectsUsingComparator {

	public static void main(String[] args) {
		Employee e1=new Employee(22,"abc");
		Employee e2=new Employee(19,"abc");
		Employee e3=new Employee(18,"abc");
		Employee e4=new Employee(24,"abc");
		Employee e5=new Employee(27,"abc");
		
		List<Employee> empList=Arrays.asList(e1,e2,e3,e4,e5);
//		System.out.println(empList);
		Collections.sort(empList, new Employee());
		System.out.println(empList);
	}

}
