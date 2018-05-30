package packVariablesExample;

public class Demo15 {

	// global variables or non static variables
	public int i;
	public int j = 30; 

	// static variables or class variables
	public static int x;
	public static int y = 40;

	public void add() {
		// a and b are local variables
		// int a ;
		int b = 10;
		int c = 20;
		// System.out.println(a+b+c);
		System.out.println(b + c + i + j + x + y);
	}

	public void mul() {
		// System.out.println(b*c);
		System.out.println(i * j * x * y);
	}

	public static void simplification() {
		Demo15 obj = new Demo15();
		System.out.println(obj.i + obj.j * x / y);
	}

}
