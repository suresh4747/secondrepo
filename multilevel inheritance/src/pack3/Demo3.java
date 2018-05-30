package pack3;

import pack2.Demo2;


public class Demo3 extends Demo2 {
public int c=30;
public void add() {
	System.out.println(a+b+c);
}
public static void main(String[] args) {
	Demo3 obj=new Demo3();
	obj.add();
}
}
