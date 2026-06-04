package instance_variable;

public class c02_instanceVariable {
	public String AccountHolderName;
	public int balance;
	public int accountNumber;
	public String branchName;
	

	public static void main(String[] args) {
		 c02_instanceVariable iv = new  c02_instanceVariable();
		 iv. AccountHolderName = "Sitarama";
		 iv.balance = 00000000;
		 iv.accountNumber = 11002233;
		 iv.branchName= "Coforge Limited";
		 
		 System.out.println(iv. AccountHolderName);
		 System.out.println( iv.balance);
		 System.out.println(iv.accountNumber);
		 System.out.println(iv.branchName);
		 
		
	}

}
