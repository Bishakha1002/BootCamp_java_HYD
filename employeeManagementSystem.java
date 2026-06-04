package EMP_SYSTEM;
import java.util.Scanner;

public class employeeManagementSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee ID:");
		int id = sc.nextInt();
		System.out.println("Enter Employee Name:");
		String name = sc.next();
		System.out.println("Enter Employee Salary:");
		double Salary = sc.nextDouble();
		System.out.println("\n---Employee Details---:");
		System.out.println("ID:" +id);
		System.out.println("Name:"+name);
		System.out.println("Salary:"+Salary);
		sc.close();
	
		
		
		

	}

}
