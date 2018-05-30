package pack6;

import pack4.Demo4;
import pack5.Demo5;

public class Demo6 extends Demo4 {
	public int d=40;
	public void mul() {
		Demo5 obj= new Demo5();
		System.out.println(a*b*obj.c*d);
	}
public static void main(String[] args) {
	Demo6 obj =new Demo6();
	obj.mul();
}
}
