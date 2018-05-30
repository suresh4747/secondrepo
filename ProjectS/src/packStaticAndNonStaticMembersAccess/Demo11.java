package packStaticAndNonStaticMembersAccess;

public class Demo11 {
	
	public void m1() {
		System.out.println("m1 is nsm");
		m2();
		m3();
		m4();
	}
	public static void m2() {
		System.out.println("m2 is sm");
	}
	public static void m3() {
		System.out.println("m3 is sm");
	}
	public void m4() {
		System.out.println("m4 is nsm");
	}
	
	
	public static void main(String[] args) {
		Demo11 obj=new Demo11();
		obj.m1();
		/*obj.m4();
		m2();
		m3();*/
	}

}
