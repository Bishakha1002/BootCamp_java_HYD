package scannerClassInJava;
import java.util.Scanner;

public class publicClassNext {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String value = sc.next();
		System.out.println("Entered values are:" + value);
		sc.close();
		

	}

}
