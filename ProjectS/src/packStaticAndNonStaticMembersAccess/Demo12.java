package packStaticAndNonStaticMembersAccess;

public class Demo12 {
	public void m1() {
		System.out.println("m1 is nsm");
	}

	public static void m2() {
		System.out.println("m2 is sm");
		m3();
		//m4();
		Demo12 obj12=new Demo12();
		obj12.m4();
		obj12.m1();
	}

	public static void m3() {
		System.out.println("m3 is sm");
	}

	public void m4() {
		System.out.println("m4 is nsm");
	}

	public static void main(String[] args) {
		m2();
	}

}
