package scannerClassInJava;

import java.util.Scanner;

public class byteExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number:");
		byte value = sc.nextByte();
		System.out.println("Entered values are:" + value);
		sc.close();

	}

}
