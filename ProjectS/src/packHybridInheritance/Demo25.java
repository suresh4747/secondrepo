package packHybridInheritance;

public class Demo25 extends Demo24{
	
	int c=30;
	public void add() {
		Demo26 obj1 =new Demo26();
		System.out.println(a+b+c+obj1.d);
	}
	public static void main(String[] args) {
		Demo25 obj =new Demo25();
		obj.add();
		
	}

}
