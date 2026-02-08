package day_30;

import java.util.Arrays;

public class StringManipulation_StringBuffer {
	
//	StringBuffer and StringBuilder are the classed of the java to use this we need to create an object
	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer("I love Java");   // it is an object and we pass string in the argument
		
// String buffer is mutable we are able to change that easily.
		
		System.out.println(str.toString()+ " and coading");   // here we convert that first into string and then manipulate that
		
//		So now that above string is updated in this case not create two diff objects because it is mutable
		
		String a = "Java";
		String b = "Java"; 
		System.out.println(a.equals(b));    // it possible becasue String class equals method overrides the Object class method
		
		StringBuffer str1 = new StringBuffer("I love Java");
		
		System.out.println(str.equals(str1));   // it is gives us false, becasue it creates 2 diff objects so we need to convert it into String first
		
		System.out.println(str.toString().equals(str1.toString()));     // now gives us true because we convert that object into string
		
//		reverse()  this function we are able to use with only StringBuffer and StringBuilder
		
		System.out.println(str.reverse());
		
//		append()  : this is SB  class overloaded method for concatenation
		System.out.println(str.append(" coading"));
		
//		split : it's String method which returns array 
		
		System.out.println("Split -------------");
		
		String xyz = "I love java and I want to learn java";
		
		String pqr[] = xyz.split(" ");            // I used array string veriable to store the return from split method
		
		System.out.println(Arrays.toString(pqr));     // it will print the array
		System.out.println(pqr.length);
		
		for (int i = 0; i< pqr.length; i++)   // for loop
		{
			System.out.println(pqr[i]);
		}
		
		for(String mnp : pqr)           // for each method to print array
		{
			System.out.println(mnp);
		}
		
//		substring is the method of string 
		
		System.out.println(xyz.substring(4));   // print all string from index 4
		
		System.out.println(xyz.substring(4,12));  // print from 4 to index 12
		
		String newStr = xyz.substring(xyz.indexOf("java"),xyz.length());   // it will print from java word to end of string
		System.out.println(newStr);
	}
	

}
