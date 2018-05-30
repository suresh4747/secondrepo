package packMLInheritance;

public class Demo23 extends Demo22 {
  int c=30;
  public void add() {
	
	  System.out.println(a+b+c);
  }
  public static void main(String[] args) {
	  
	  Demo23 obj = new Demo23();
	  obj.add();
	
}
}
