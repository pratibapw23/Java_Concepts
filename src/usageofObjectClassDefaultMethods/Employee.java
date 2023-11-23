package usageofObjectClassDefaultMethods;

import java.util.HashSet;

class Manager implements Cloneable{
	
	int id;
	String name;
	int age;
	
	public Manager() {
		
	}
	
	public Manager(int id,String name,int age) {
		this.age=age;
		this.id=id;
		this.name=name;
	}
	public Manager clone(Manager object) throws CloneNotSupportedException {
		return (Manager)object.clone();
	}
}

public class Employee{
	static Manager object=new Manager();
	static Manager obj1=new Manager(10,"John",20); //new Object - diff hashcode
	static Manager obj2=new Manager(10,"John",20); //new Object - Diff hashcode
	static Manager obj3=obj1; //shallow copy
	
	
	
	public static void main(String[] args) {
		
		HashSet<Manager> set=new HashSet<>();
		set.add(obj1);
		set.add(obj2);
		set.add(obj3);
		Manager obj4 = null;
		try{
			obj4=object.clone(obj1);	// deep copy - diff memory location
		}catch(CloneNotSupportedException e) {
			System.out.println(e);
		}
		
		set.add(obj4);
		System.out.println(obj4); //Deep copy of obj1 - creates a new object with new memory location
		System.out.println(obj1); //new Object - new memory location
		System.out.println(obj2); //new object - new memory location event if same data stored in variables.
		System.out.println(obj3); //Shallow copy of object one, NO new memory location.
//		System.out.println(set.toString()); //printing - packageName.classname@hashCode, e.g: [usageofObjectClassMethods.Manager@e580929]
		System.out.println(set.size()); //3
		
		///equals() method: - default implementation compares the hash values of the objects
		
		System.out.println(obj1.equals(obj2)); // false:obj1 and obj2 are both different objects with different hash values
		System.out.println(obj1.equals(obj3)); // true:obj3 is the shallow copy of obj1, hence both having same hash value
		System.out.println(obj1.equals(obj4)); // false:obj4 is the deep copy of obj1, hence both having different hash values
	}

}

/*
1. When the deep copy is created, it will allocate new memory location to the object and hash value of
newly created object is calculated and used to store this object in HashSet(); Hence it will store
cloned object as new object in HashSet because hash Value is different.
2. When the Shallow copy is created, no new address is allocated to object, only the data members are copied.
Since the hashValue is same, this object is not stored in set because it does not allows to store objects with same Hash Value.
 */
