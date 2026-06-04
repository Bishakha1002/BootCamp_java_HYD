package scannerClassInJava;

import java.util.Scanner;

public class floatExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your weight:");
		float value = sc.nextFloat();
		System.out.println("Entered values are:" + value);
		sc.close();
		

	}

}
