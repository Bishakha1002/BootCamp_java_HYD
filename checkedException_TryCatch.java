package Exceptions;

public class checkedException_TryCatch {
	int x = 10/0;
	public void m1() {
		System.out.println("Value of x is:" + x);
	}

	public static void main(String[] args) {
		checkedException_TryCatch obj = new checkedException_TryCatch();
		obj.m1();
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
			
		
		
//Thread sleep is used to stop the execution for the fixed time.
	}

}
