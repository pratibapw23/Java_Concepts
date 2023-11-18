package createCustomImmutableClassExample;

public class UseDefaultToStringMethod {
	
	int id;
	UseDefaultToStringMethod(int id){
		this.id=id;
	}
	
//	public String toString() {
//		return "["+id+"]";
//		
//	}
	

	public static void main(String[] args) {
		UseDefaultToStringMethod obj=new UseDefaultToStringMethod(1);
		System.out.println(obj);
		
	}

	@Override
	public String toString() {
		return "UseToStringMethod [id=" + id + "]";
	}

}
