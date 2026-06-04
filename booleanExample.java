package scannerClassInJava;

import java.util.Scanner;

public class booleanExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you a Student?(true/false):");
	    boolean student = sc.nextBoolean();
	    System.out.println("Your answer is :"+ student);
		
		sc.close();
	}

}
