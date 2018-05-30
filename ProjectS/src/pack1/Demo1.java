package pack1;

public class Demo1 {
	
	//user defined method
	public void myName() {
		//sop-->type syso-->ctrl+space bar
		System.out.println("my name is x");
	}
	

	
	//main is jvm method name and main method is execution engine or execution entry point
	public static void main(String[] args) {
		
		//object creation syntax
		//classname objectname=new classname();
		//object name is userdefined name
		Demo1 obj=new Demo1();
		obj.myName();

	}

}
