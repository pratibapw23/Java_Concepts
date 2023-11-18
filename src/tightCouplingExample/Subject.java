package tightCouplingExample;

public class Subject {

	public static void main(String[] args) {
		
		Subject obj=new Subject();
		obj.callTopicMethod();
		
	}
	public void callTopicMethod() {
		Topic t=new Topic();
		t.todo();
	}


}
class Topic{
	public void todo() {
		System.out.println("Hi");
	}
}

/*Example of Tight Coupling
 * In above example, if we change name of method in Topic class to
 * todoOne then we need to make changes in Subject class as it is fully 
 * dependent on Topic class. We need make changes in callTopicMethod() function
 * in Subject class.
 */
