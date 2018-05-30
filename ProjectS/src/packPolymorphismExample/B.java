package packPolymorphismExample;

public class B extends A {

	public void add(int a, double b) {
		System.out.println(a+b);
	}
	
	public void nokiaDesign(String mobile) {
		System.out.println("Nokia design...");
	}
	
	public static void main(String[] args) {
		B obj=new B();
		obj.nokiaDesign("Nokia4");
		A object=new A();
		object.nokiaDesign("Nokia11");
	}
}
