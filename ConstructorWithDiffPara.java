package constructor.TestDemo;

public class ConstructorWithDiffPara {
	public ConstructorWithDiffPara() {
		System.out.println("Constructor with zero arguments");
	}
	public ConstructorWithDiffPara(int Count) {
		System.out.println("Integer type constructor and Count is :" + Count);
	}
	public ConstructorWithDiffPara(double Count, float Count1) {
		System.out.println("Double type and Float constructor and Count is :" + Count + Count1);
	}
	public ConstructorWithDiffPara(String name) {
		System.out.println("String tyoe constructor and name is :" + name);
	}
	public void display() {
		System.out.println("working fine");
	}

	public static void main(String[] args) {
		ConstructorWithDiffPara obj1 = new ConstructorWithDiffPara();
		obj1.display();
		ConstructorWithDiffPara obj2 = new ConstructorWithDiffPara(10);
		obj2.display();
		ConstructorWithDiffPara obj4 = new ConstructorWithDiffPara();
		obj4.display();
		ConstructorWithDiffPara obj3 = new ConstructorWithDiffPara("Neha");
		obj3.display();
		

	}

}
