package packMLInheritance;

public class Demo21 {
	int a=10;
	public void sub(){
		
		Demo22 obj=new Demo22();
		Demo23 obj1=new Demo23();
		
		System.out.println(a-obj.b-obj1.c);
		
	}
	public static void main(String[] args) {
		  
		  Demo21 obj = new Demo21();
		  obj.sub();

	}}
