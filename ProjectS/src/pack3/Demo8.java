package pack3;
import pack2.Demo7;

public class Demo8 {
	public void m3() {
		System.out.println("m3 is demo8 nsm");
	}
	public static void m4() {
		System.out.println("m4 is demo8 sm");
	}
	
	public static void main(String[] args) {
		Demo7 objD7=new Demo7();
		objD7.m1();
		Demo7.m2();
		Demo8 objD8=new Demo8();
		objD8.m3();
		m4();
	}
}
