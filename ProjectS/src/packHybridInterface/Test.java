package packHybridInterface;

public class Test implements I4{

	@Override
	public void add() {
		System.out.println(a+b+c+d);
		
	}

	@Override
	public void sub() {
	System.out.println(a-b-c-d);
		
	}

	@Override
	public void mul() {
System.out.println(a*b*c*d);		
	}

	@Override
	public void div() {
		System.out.println(c/d);
	}

	
public static void main(String[] args) {
	Test t1=new Test();
	t1.add();
	t1.div();
	t1.mul();
	t1.sub();
	
}

}
