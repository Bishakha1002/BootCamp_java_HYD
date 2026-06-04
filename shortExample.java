package scannerClassInJava;

import java.util.Scanner;

public class shortExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number:");
		short value = sc.nextShort();
		System.out.println("Entered values are:" + value);
		sc.close();

	}

}
