package MPSystem;

import java.util.Scanner;

public class mobilePhoneManagementSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Mobile Brand:");
		String brand = sc.next();
		System.out.println("Enter Mobile Model:");
		String model = sc.next();
		System.out.println("Enter Price:");
		double Price = sc.nextDouble();
		System.out.println("\n---Mobile Details---:");
		System.out.println("Brand:"+brand);
		System.out.println("Model:" +model);
		System.out.println("Price:"+Price);
		sc.close();
	}

}
