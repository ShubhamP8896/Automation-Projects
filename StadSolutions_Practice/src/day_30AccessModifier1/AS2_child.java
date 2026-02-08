package day_30AccessModifier1;

public class AS2_child extends AS1
{
	public static void main(String[] args) {
		
//		only default, Public and protected access modifier variables and methods are able to access with child class object
		
		AS2_child obj = new AS2_child();
		
		System.out.println(obj.defaultS);
		System.out.println(obj.protStr);
		System.out.println(obj.PubStr);
		
		obj.defMethod();
		obj.proMethod();
		obj.pubMethod();
		
	}

}
