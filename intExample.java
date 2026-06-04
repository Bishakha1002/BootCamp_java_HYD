package scannerClassInJava;

import java.util.Scanner;

public class intExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your roll:");
		int value = sc.nextInt();
		System.out.println("Entered values are:" + value);
		sc.close();
		

	}

}
