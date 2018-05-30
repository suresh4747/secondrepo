package pack1;

import pack2.Demo2;
import pack3.Demo3;

public class Demo1 {
	public int a=10;
	public void sub() {
		Demo2 obj=new Demo2();
		Demo3 obj1=new Demo3();
		
		
		System.out.println(a-obj.b-obj1.c);
		
	}
	public static void main(String[] args) {
		Demo1 obj=new Demo1();
		obj.sub();
	}

}
