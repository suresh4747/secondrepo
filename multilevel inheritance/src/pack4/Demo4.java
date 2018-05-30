package pack4;

import pack5.Demo5;
import pack6.Demo6;

public class Demo4 {
	
	public int a =10;
	public int b= 20;
	public void sub() {
		Demo5 obj=new Demo5();
		Demo6 obj1=new Demo6();
		
		System.out.println(a-b-obj.c-obj1.d);
		
	}
public static void main(String[] args) {
	Demo4 obj=new Demo4();
	obj.sub();
}
}
