package createCustomImmutableClassExample;

public final class Student {
	
	private int id;
	private String name;
	
	Student(int id, String name){
		this.id=id;
		this.name=name;
	}
	

	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public static void main(String[] args) {
		
		Student obj=new Student(1,"abc");
		System.out.println("ID="+obj.getId());
		System.out.println("NAME="+obj.getName());

	}

}
