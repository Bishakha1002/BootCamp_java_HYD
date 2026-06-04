package constructor.TestDemo;

public class ConstructorWithThisKeyword {
	public ConstructorWithThisKeyword() {
		this(10);
		System.out.println("No Value in Parameter");
	}
		
	
		
		
	
	public ConstructorWithThisKeyword(int Count) {
		this("Bishakha");
		System.out.println("Int type Constructor and Count is:" + Count);
	}
	public ConstructorWithThisKeyword(String name) {
		
		System.out.println("String type Constructor and name is:" + name);
	}
	

	public static void main(String[] args) {
		ConstructorWithThisKeyword obj1 = new ConstructorWithThisKeyword();
	}
}
		

	



