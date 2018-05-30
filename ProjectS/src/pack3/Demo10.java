package pack3;

import pack2.Demo9;

public class Demo10 extends Demo9 {

	public void m3() {
		System.out.println("m3 is demo10 nsm");
	}
	public static void m4() {
		System.out.println("m4 is demo10 sm");
	}
	public static void main(String[] args) {
		Demo10 objD10=new Demo10();
		objD10.m1();
		objD10.m3();
		m2();
		m4();
	}
}
