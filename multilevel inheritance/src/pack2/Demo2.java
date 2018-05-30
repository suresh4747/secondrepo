package pack2;

import pack1.Demo1;
import pack3.Demo3;

public class Demo2 extends Demo1{
	public int b=20;
	public void mul() {
		Demo3 obj= new Demo3();
		
		
		System.out.println(a*b*obj.c);
		
	}
	public static void main(String[] args) {
		Demo2 obj=new Demo2();
		obj.mul();
		
	}

}
