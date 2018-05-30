package packHybridInheritance;

public class Demo24 {
	
	int a =10;
	int b= 20;
	public void sub() {
		
		Demo25 obj=new Demo25();
		Demo26 obj1=new Demo26();
		
		System.out.println(a-b-obj.c-obj1.d);
	}
	public static void main(String[] args) {
		Demo24 obj = new Demo24();
		obj.sub();
		
	}
	

}
