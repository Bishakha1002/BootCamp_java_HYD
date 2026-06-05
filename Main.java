package Interface;

interface FirstInterface {
	
	void myMethod();
	
	void myotherMethod();
	
	

}

interface SecondInterface {
	 
	
}

class DemoClass implements FirstInterface, SecondInterface {
	public void myMethod() {
		System.out.println("First method");
		
	}
	public void myotherMethod() {
		System.out.println("Second method");
		
	}
	
	
}
public class Main {
	public static void main(String [] args) {
		DemoClass ob = new DemoClass();
		ob.myMethod();
		ob.myotherMethod();
		
		
	}
}
