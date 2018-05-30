package packVariablesExample;

public class Demo18 {

	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void add(double a, double b) {
		System.out.println(a+b);
	}
	public void registration(String fname,String lname, int age) {
		System.out.println("my first name is :"+fname);
		System.out.println("my last name is :"+lname);
		System.out.println("my age is :"+age);
	}
	
	public void registration(String fname,String lname,String city, int age) {
		System.out.println("my first name is :"+fname);
		System.out.println("my last name is :"+lname);
		System.out.println("my city is :"+city);
		System.out.println("my age is :"+age);
	}
	
	public static void main(String[] args) {
		Demo18 obj=new Demo18();
		/*obj.add(11, 22);
		obj.add(100, 200);
		obj.add(1.5, 2.3);*/
		/*obj.registration("xyz", "abc", 11);
		System.out.println();
		obj.registration("lmn", "pqr", 21);
		System.out.println();*/
		obj.registration("x", "y", "Bng",32);
	}
}
