package comparatorAndComparableExamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	int age;
	String name;
	
	public Student(int age, String name) {
		this.age=age;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "Student{"
				+ "name="+name+", "
				+ "age="+age+"}";
	}
	
	@Override
	public int compareTo(Student stud) {
		return stud.age-this.age;
	}
}
public class SortStudentsObjectsUsingComparable {

	public static void main(String[] args) {
		Student s1=new Student(20, "abc");
		Student s2=new Student(30,"pqr");
		Student s3=new Student(19,"abc");
		Student s4=new Student(40,"pqr");
		
		List<Student> studList=Arrays.asList(s1,s2,s3,s4);
		Collections.sort(studList);
		System.out.println(studList);
	}

}
