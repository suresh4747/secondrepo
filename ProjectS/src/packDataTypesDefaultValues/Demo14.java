package packDataTypesDefaultValues;

public class Demo14 {
	
	byte bMax=Byte.MAX_VALUE;
	//byte b=-129;
	//byte b=128;
	byte bMin=Byte.MIN_VALUE;
	short sMax=Short.MAX_VALUE;
	short sMin=Short.MIN_VALUE;
	int iMax=Integer.MAX_VALUE;
	int iMin=Integer.MIN_VALUE;
	long lMax=Long.MAX_VALUE;
	long lMin=Long.MIN_VALUE;
	
	
			
	
	char c='a';
	boolean bool=true;
	String city="Bangalore";
	String sName="xyz";
	String fName="abc";
	
	public void dataTypesRanges() {
		System.out.println("byte max value is :"+bMax);
		System.out.println("byte min value is :"+bMin);
		
		System.out.println("short max value is :"+sMax);
		System.out.println("short min value is :"+sMin);
		
		System.out.println("int max value is :"+iMax);
		System.out.println("int min value is :"+iMin);
		
		System.out.println("long max value is :"+lMax);
		System.out.println("long min value is :"+lMin);
		System.out.println("I am in :"+city);
		System.out.println(sName+" "+fName);
	}
	public static void main(String[] args) {
		Demo14 obj=new Demo14();
		obj.dataTypesRanges();
	}

}
