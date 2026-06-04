package scannerClassInJava;

import java.util.Scanner;

public class charExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = sc.next();
		System.out.println("First Character:" + name.charAt(0));
		sc.close();

	}

}
