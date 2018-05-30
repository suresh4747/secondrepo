package pack5;

import pack4.Demo4;
import pack6.Demo6;

public class Demo5 extends Demo4 {
	public int c=30;
	public void add() {
		Demo6 obj=new Demo6();
		
		System.out.println(a+b+c+obj.d);
		
	}
	public static void main(String[] args) {
		Demo5 obj =new Demo5();
		obj.add();
		
	}

}
