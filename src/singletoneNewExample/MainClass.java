package singletoneNewExample;

public class MainClass {

	public static void main(String[] args) {
		SingletoneClass obj1=SingletoneClass.getInstance();
		SingletoneClass obj2=SingletoneClass.getInstance();
		
		System.out.println(obj1);
		System.out.println(obj2);
	}

}
