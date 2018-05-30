package packHYbridInterface2final;

public class Test implements If2,If3,If4 {

	@Override
	public void add() {
	System.out.println(a+b+c+d);
		
	}

	@Override
	public void div() {
System.out.println(d/b);		
	}

	@Override
	public void mul() {
System.out.println(a*b*c*d);		
	}

	@Override
	public void sub() {
System.out.println(a-b-c-d);		
	}

	
public static void main(String[] args) {
	Test t=new Test();
	t.add();
	t.sub();
	t.mul();
	t.div();
			
}
}
