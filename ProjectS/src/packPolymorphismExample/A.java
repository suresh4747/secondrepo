package packPolymorphismExample;

public class A {
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void add(int a, int b,int c) {
		System.out.println(a+b);
	}
	public void add(double a, double b) {
		System.out.println(a+b);
	}
	
	public void nokiaDesign(String mobile) {
		System.out.println("My ..");
	}
	
	/*public static void main(String[] args) {
		A obj=new A();
		obj.add(1.02, 2.90);
		obj.add(11, 22);
	}*/

}
