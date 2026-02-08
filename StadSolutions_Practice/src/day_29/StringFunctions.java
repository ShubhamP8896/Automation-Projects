package day_29;

public class StringFunctions 
{
	public static void main(String[] args) {
		String a = "I love Coading in java object";                      // String literals
		
		String str = new String("Object of the String");       // this is object of string we assigned value in argument
//		class  ref = kwrd  class   'constructor'
		
		System.out.println(a);
		
		System.out.println(a.length());  // print the length of the string >> 14
		
//		1) charAt(): pass index in the argument
		
//		a.charAt(50);     >> for this showing an exception : StringIndexOutofBoundException\
		
		System.out.println(a.charAt(4));       // print the letter which present at the index 4
		
//		2) indexOf : It is overloaded method of String which is used to find the index of the letter which we pass in the argument
		
		System.out.println(str.indexOf('t'));        // search the index of that charector >> Always search first "t" letter's index if multiple letters available
		
		System.out.println(str.indexOf("of"));   // we pass the string and this print the index of the first letter of that "of" word means 'o'.
		
		System.out.println(str.indexOf('t', 6));  // In this we pass the letter whose index we need and index like from which index it should start searching
		
		System.out.println(str.indexOf("Java"));  // If we pass that word which not in the String then for that it will always return -1. 
		
		//find the second occurence of i
		System.out.println("-----------------");
		
		System.out.println(a.indexOf('o',a.indexOf('o')+1));    // second "o" index is showing.
		
		System.out.println(a.indexOf('o',9 ));              // third occurence of the 'o' > first we find first, then second the third
		
		System.out.println("-------------------------------");
		
//		contains function/method:- its showing true or false as per the searched word is present in the string or not, it returns true/false
		
		String cont = "I love java and python";
		System.out.println(cont.contains("java"));           // true
		System.out.println(cont.contains("C++"));			// false
		
		String url = "www.google.com";
		if(url.contains("google"))
		{
			System.out.println("URL is valid");
		}
		else
		{
			System.out.println("not valid");
		}
		
//		trim function/method:- Used to remove the extra spaces at starts and ends only not in between the word
		System.out.println("---------------------------");
		
		String trm = " Shubham Pawar    ";
		System.out.println(trm.trim());
		
//		replace() : one character replace with another character

		String s = "Selenium and java";
		
		System.out.println(s.replace('j','J'));
		
		String dob = "08-08-1996";
		System.out.println(dob.replace('-', '/'));
		
		
		
		
		
		
		
		
	}
	

}
