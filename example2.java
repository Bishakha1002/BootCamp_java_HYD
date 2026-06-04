package scannerClassInJava;

import java.util.Scanner;

public class example2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String value = sc.nextLine();
		System.out.println("Entered values are:" + value);
		sc.close();
		
	}

}
