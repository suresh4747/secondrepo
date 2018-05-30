package packDataTypesDefaultValues;

public class Demo13 {

	byte b;// byte is data type and b is variable name-->this is declaration-->variable
			// name is userdefined name
	short s;
	int i;
	long l;
	float f;
	double d;
	char c;
	boolean bool;
	String str;
	


	public void dataTypesDefaultValues() {
		System.out.println("Byte default value is  :" + b);
		System.out.println("Short default value is :"+s);
		System.out.println("int default value is  :" + i);
		System.out.println("long default value is :"+l);
		System.out.println("float default value is  :" + f);
		System.out.println("double default value is :"+d);
		System.out.println("char default value is  :" + c);
		System.out.println("boolean default value is :"+bool);
		System.out.println("string default value is  :" + str);
	}

	public static void main(String[] args) {
		Demo13 obj = new Demo13();
		obj.dataTypesDefaultValues();
	}

}
