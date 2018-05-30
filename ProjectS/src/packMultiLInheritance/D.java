package packMultiLInheritance;

public class D implements C {

	@Override
	public void sub() {
		System.out.println(a-b-c);
		
	}

	@Override
	public void add() {
		System.out.println(a+b+c);
		
	}

	@Override
	public void mul() {
	System.out.println(a*b*c);
		
	}
	public static void main(String[] args) {
		D d1=new D();
		d1.add();
		d1.sub();
		d1.mul();
	}

	

}
