package singletoneNewExample;

public class SingletoneClass {
	
	private static volatile SingletoneClass object=null;
	
	private SingletoneClass() {
		
	}
	
	public static SingletoneClass getInstance() {
		if(object==null) {
			synchronized(SingletoneClass.class) {
				if(object==null) {
					object=new SingletoneClass();
				}
				
			}
		}
		return object;
	}

}
