package packHybridInheritance;

public class Demo26 extends Demo24{
	int d=40;
	public void mul(){
		Demo25 obj=new Demo25();
		
		System.out.println(a*b*obj.c*d);
	}
public static void main(String[] args) {
	Demo26 obj =new Demo26();
	obj.mul();
	
}
}
