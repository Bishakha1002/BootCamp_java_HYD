package DecisionMakingStatements;

public class Nested_if {

	public static void main(String[] args) {
		String address ="India, Banglore";
		if(address.endsWith("India")) {
			if(address.contains("Meerut")) {
				System.out.println("Your city is meerut");
			}else if(address.contains("noida")) {
				System.out.println("Your city is noida");
			}else {
				System.out.println("India");
			}
		}else {
			System.out.println("You are not living in India");
			}
		}

	}


