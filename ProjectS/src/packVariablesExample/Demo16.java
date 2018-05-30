package packVariablesExample;

public class Demo16 {
	
	public int x=100;
	public int y=200;
	
	//final or constant variable
	public static final int z=250;
	public void add() {
		x=50;
		Demo16 a=new Demo16();
		
		
		System.out.println(a.x+y+z);
	}

	public static void main(String[] args) {
		Demo16 obj=new Demo16();
		obj.add();
	}
}
