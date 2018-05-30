package packInterfaceExample;

public class A implements I{

	public int c;
	public int d=70;
	public void m2() {
		System.out.println("i am interface member...");
	}
	public void m3() {
		System.out.println("i am class member");
	}
	
	public static void main(String[] args) {
		/*A obj=new A();
		obj.m2();
		obj.m3();
		System.out.println(obj.c+obj.d+b);*/
		
		//I x=new I();
		I obj=new A();//here obj is reference for interface or parent but object of child or class
		obj.m2();
		A obj1=new A();
		obj1.m3();
	
		
		System.out.println(b);
		
	}

}

