package velocitypackage1;

public class ElevenMethod3 
{
//	 Non-Return Type static Method :-----------------------------------------------
//	public static void additionmethod()          //Static Method
//	{
//		int a = 40;
//		int b = 50;
//		int c = a + b;
//		System.out.println(c);
//	}
	
//	Return Type Static Method:-----------------------------------------------------
//	public static int additionmethod()      //we are able to use any datatype: char string double
//	{
//		int a = 60;              //but need to use that same data type in method body also.
//		int b = 50;
//		int c = a + b;
////		System.out.println(c);
//		return c;                             // It's always at last. Need to give
//	}
	
//	Return type method with char data type :--------------------------------------------	
//	public static char chardatatype()
//	{
//		char a = 'S';
//		System.out.println(a);
//		return a;
//	}
//	String data type with Methods:------------------------------------
//	public static String stringdatatype()
//	{
//	String a = "shubham ";
//	String b = "Balaji ";
//	String c = "Pawar";
//	String d = a+b+c;
//	System.out.println(d);
//	return d;
//	}
	
//	Method with Paranthesis/signature body ()             :-------------------------------------
//	public static void signatureMethod(int a)
//	{
//		System.out.println("Method with paranthesis");
//	}
	
//	Method with Paranthesis/signature body double argument ()             :-------------------
//	We are able to use any datatype in that bracket:
	public static void signatureMethod2(int a, int b)
	{
		int x = a;
		int y = b;
		int z = x+y;	 // OR   z = a + b; we are able to use this also
		System.out.println(z);
	}
	
	
	public static void main(String[] args) 
	{
//		additionmethod();                       //we dont need to use printing statement here
		
//		ElevenMethod3.additionmethod();       //we are also able to use class with method
		
//		Also we are able to use for return type method:------------------ Same Answer we get
		
//		System.out.println(additionmethod());  // If we are not used printing stat. in method above
		 
//		Because additionmethod returns "c" which is a+b .............
		
//		Also We are able to use return type with below example:
//		int x = additionmethod();
//		System.out.println(x);                //this is different of return and non returntype.
		
		 // For Char Datatype:---------------------------------------------------------- 
//		chardatatype();             
		
//		 String data type:--------------------------------------------------------------
//		stringdatatype();
		
//		Method with Paranthesis/signature body ()             :-------------------------------------	
//		Wee need to pass any value in bracket, we called that valus as argument and () = Signature
		
//		ElevenMethod3.signatureMethod(50);
		
//		Method with Paranthesis/signature body double argument ()             :----------------	
		
		ElevenMethod3.signatureMethod2(50, 700);
		
		
		
	}

}
