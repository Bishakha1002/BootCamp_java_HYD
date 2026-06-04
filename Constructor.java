package constructor.TestDemo;

public class Constructor {
	private String name;
	
	Constructor(){
		System.out.println("Constructor called.....:");
		name = "Coforge java learning";
	}

	public static void main(String[] args) {
		Constructor obj = new Constructor();
		System.out.println("The name is:"+ obj.name);
	
	}

}
