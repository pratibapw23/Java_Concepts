package constructorExample;
public class Animal {
	
	private String name;
	
	public Animal() {
		this.name="name";
	}
	
	public Animal(String name) {
		this.name=name;
	}

	public static void main(String[] args) {
		
		Animal anim=new Animal();

	}

}
