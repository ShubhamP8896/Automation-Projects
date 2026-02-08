package day_30AccessModifier1;

public class AS5 {
	
//	only default, Public and protected access modifier variables and methods are able to access with that class object only
public static void main(String[] args) {
	AS1 obj = new AS1();
	
	System.out.println(obj.defaultS);
	System.out.println(obj.protStr);
	System.out.println(obj.PubStr);
	
	obj.defMethod();
	obj.proMethod();
	obj.pubMethod();
	
	
}

}
