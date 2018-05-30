package packMLInheritance;

public class Demo22 extends Demo21 {

	int b = 20;

	public void mul() {
		Demo23 obj1 = new Demo23();
		System.out.println(a * b * obj1.c);
	}
	public static void main(String[] args) {

		Demo22 obj = new Demo22();
		obj.mul();

	}
}
