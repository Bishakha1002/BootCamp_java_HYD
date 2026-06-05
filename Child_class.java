package InheritanceJava;

public class Child_class extends Base_class {
	
	public void mul() {
		System.out.println("Multiplication is 250");
	}
	
	public void div() {
		System.out.println("Division is 20");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child_class ob = new Child_class();
		ob.add();
		ob.subs();
		ob.mul();
		ob.div();
		System.out.println("--");
		Base_class ob2 = new Base_class();
		ob.add();
		ob.subs();
		System.out.println("--");

	}

}
