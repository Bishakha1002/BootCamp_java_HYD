package AccessModifiers;
class B{
	int x = 10;
	public void b1() {
		System.out.println("This is just a print method");
	}
	protected int z = 200;
	protected void protectedMethod() {
		System.out.println("This is the protected method");
	}
}

public class c_02_DefaultClass {
	public static void main(String[] args) {
	B obj = new B();
	int output = obj.z;
	System.out.println("value of z is:"+output);
	obj.protectedMethod();

	
		
	}

}
