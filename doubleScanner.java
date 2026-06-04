package scannerClassInJava;

import java.util.Scanner;

public class doubleScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your value:");
		double value = sc.nextDouble();
		System.out.println("Entered values are:" + value);
		sc.close();
		

	}

}
