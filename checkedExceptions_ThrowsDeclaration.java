package Exceptions;

public class checkedExceptions_ThrowsDeclaration {
	int x = 143/0;
	
	public void m1() {
		System.out.println("Value of x is: " +x);
	}

	public static void main(String[] args)  throws Exception{
		checkedExceptions_ThrowsDeclaration  obj = new checkedExceptions_ThrowsDeclaration();
		obj.m1();
		Thread.sleep(1000);
		

	}

}
