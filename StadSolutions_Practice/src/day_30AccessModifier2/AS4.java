package day_30AccessModifier2;

import day_30AccessModifier1.AS1;

public class AS4 {
	public static void main(String[] args) {
//		Here we are able to access only public access variables and methods
		
		AS1 obj = new AS1();

		System.out.println(obj.PubStr);
		
		obj.pubMethod();
		
		
	}
}
