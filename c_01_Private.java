package AccessModifiers;

public class c_01_Private {

	public static void main(String[] args) {
		A obj = new A();
		int result = obj.x;
		System.out.println("Result is:"+result);
		

	}
class A {
	int x = 99;
}
}
