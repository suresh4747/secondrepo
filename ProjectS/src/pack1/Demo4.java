package pack1;

public class Demo4 {
	
	public void m3() {
		System.out.println("m3 is demo4 nsm");
	}
	public static void m4() {
		System.out.println("m4 is demo4 sm");
	}
	public static void main(String[] args) {
		Demo3 objD3=new Demo3();
		objD3.m1();
	//	objD3.m2();don't create like that
		//m2(); can't call directly in different class
		Demo3.m2();
		m4();
		Demo4 objD4=new Demo4();
		objD4.m3();
	}

}
