package mypractise;

public class Dmeo2 extends Demo1 {

	public void m3() {
		System.out.println("m3 is non static");

	}

	public static void m4() {
		System.out.println("m4 is static");
	}

	public static void main(String[] args) {

		Dmeo2 obj = new Dmeo2();
		obj.m3();
		m4();
		obj.m1();
		m2();
		
		
	}
}
