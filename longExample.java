package scannerClassInJava;

import java.util.Scanner;

public class longExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number:");
		long value = sc.nextLong();
		System.out.println("Entered values are:" + value);
		sc.close();
		

	}

}
