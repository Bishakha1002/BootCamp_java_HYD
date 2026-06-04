package BankAccount;

class BankAccount{
	String branchName;
	String accountHolder;
	double balance;
	void deposit(double amount) {
		balance += amount;
		
	}
	void withdraw(double amount) {
		balance -= amount;
	}
	void displayBalance() {
		System.out.println(balance);
	}
	void branchName() {
		System.out.println(branchName="SBI");
	}
	
		
	
}

public class bankAccountExample {

	public static void main(String[] args) {
		BankAccount acc = new BankAccount();
		acc.accountHolder = "Bishakha";
		acc.balance = 1000000;
		acc.deposit(50000);
		acc.withdraw(20000);
		acc.displayBalance();
		acc.branchName();
		
	

	}

}
