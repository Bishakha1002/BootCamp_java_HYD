package constructor.TestDemo;

public class ConstructorWithoutThisKeyword {
	public ConstructorWithoutThisKeyword() {
		System.out.println("Constructor with zero arguments");
	}
	public ConstructorWithoutThisKeyword(int count) {
		System.out.println("Integer type constructor and Count is :" + count);
	}
	public ConstructorWithoutThisKeyword(String name) {
		System.out.println("String tyoe constructor and name is :" + name);
	}
	public void display() {
		System.out.println("working fine");
	}

	public static void main(String[] args) {
		ConstructorWithoutThisKeyword obj1 = new ConstructorWithoutThisKeyword();
		obj1.display();
		ConstructorWithoutThisKeyword obj2 = new ConstructorWithoutThisKeyword(10);
		obj2.display();
		ConstructorWithoutThisKeyword obj3 = new ConstructorWithoutThisKeyword("Neha");
		obj3.display();
		
		

	}

}
