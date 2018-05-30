package pack1;

public class Demo2 {
		//code formate--->ctrl+Shift+f
	//single line delete--->ctrl+d
	//single line comment-->//
	//multi line comment-->ctrl+shift+/,,,,for uncomment-->ctrl+shift+\
	//non static method-->m1 doesn't have static keyword inside the method signature
	public void m1() {
		System.out.println("m1 is non static method....");
	}
	//static method-->m2 has static keyword inside the method signature
	public static void m2() {
			System.out.println("m2 is  static method....");
		}
	//type main-->ctrl+spce bar
	public static void main(String[] args) {
		Demo2 obj=new Demo2();
		obj.m1();
		//obj.m2();
		m2();
	}
}
