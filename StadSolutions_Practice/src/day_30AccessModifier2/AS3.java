package day_30AccessModifier2;

import day_30AccessModifier1.AS1;

public class AS3 extends AS1
{
public static void main(String[] args) {
//	Here we are able to access only public and protected access variables and methods
	
	AS3 obj = new AS3();
	
	System.out.println(obj.protStr);
	System.out.println(obj.PubStr);
	
	obj.proMethod();
	obj.pubMethod();
}
}
