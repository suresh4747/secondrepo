package pack1;

public class Demo6 extends Demo5 {
	public void m3() {
		System.out.println("m3 is demo6 nsm");
	}
	public static void m4() {
		System.out.println("m4 is demo6 sm");
	}
	
	public static void main(String[] args) {
		Demo6 objD6=new Demo6();
		objD6.m1();
		objD6.m3();
		m2();
		m4();
	}
}
