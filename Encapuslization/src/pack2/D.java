package pack2;

import pack1.*;


public class D extends A {
	public void m4() {
		B b=new B();
		
		//System.out.println(a);
		System.out.println(b.b);
//		System.out.println(c);
		System.out.println(d);
		System.out.println(b.f);

}
	public static void main(String[] args) {
		D d1 =new D();
		d1.m4();
	}
}
