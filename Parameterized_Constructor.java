package constructor.TestDemo;

public class Parameterized_Constructor {
	String languages;
	
	Parameterized_Constructor(String lang){
		languages=lang;
		System.out.println(languages + " Programming Language ");
	}
	

	public static void main(String[] args) {
		Parameterized_Constructor  obj1 = new Parameterized_Constructor("Java");
		Parameterized_Constructor  obj2 = new Parameterized_Constructor("Python");
		Parameterized_Constructor  obj3 = new Parameterized_Constructor("JavaScrpt");
		
	}

}
