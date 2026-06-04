package scannerClassInJava;

import java.util.Scanner;

public class hasnextExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
		String Word = sc.next();
		System.out.println( Word);
		}
		sc.close();

	}

}
