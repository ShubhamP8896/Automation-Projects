package VelocityPackage11;

class StringClass3                                         // Session -32

{
	public static void main(String[] args) 
	{
//		String Methods :---------------------------------
//		1.  Lenght :- How to measure length of that word. (Number of char in word)
	
//		String a = "Shubham";
//		String b = "Shubham Pawar";
//		
//		System.out.println(a.length());
//		System.out.println(b.length());
		
//		2. Equal :- Shows both variables values are same or not
	
//		String a = "Shubham";		
//		String b = "SHUBHAM";
//		System.out.println(a.equals(b));              // false
//		-------- OR------------
//		System.out.println(a.equals("SHUBHAM"));  // we able to use this also if we didn;t use any variable
		
		
//		
//		3. equalsignorecase:- It ignores case sensitiveness (Not conside upper and lower letter)
		
//		String a = "Shubham";
//		String b = "SHUBHAM";
//		System.out.println(a.equalsIgnoreCase(b));                    // tRUE
		
//		4. CharAt Index:- At what number which word is available.
//		String a = "Shubham";
//		System.out.println(a.charAt(0));
//		System.out.println(a.charAt(1));
//		System.out.println(a.charAt(2));
//		System.out.println(a.charAt(3));
//		System.out.println(a.charAt(4));
		
//		5. Concat Mathod:------(When we need to join two strings.
//		A. Simple method
//		String a = "Shubham";
//		System.out.println(a + " Pawar");
//		
//		B. COncat method
		
//		System.out.println(a.concat("Pawar"));
		
//		6. toUppercase:- To convert lower case values into upper case
		
//		String a = "shubham";
//		System.out.println(a.toUpperCase());
		
//		6. tolowercase:- To convert upper case values into lower case
		
//		String a = "SHUBHAM";
//		System.out.println(a.toLowerCase());
		
//		7. STARTSWITH:- THAT STRING IS START WITH MENTIONED LETTERS OR NOT
		
//		String a = "SHUBHAM";
//		System.out.println(a.startsWith("sh"));             //false
//		System.out.println(a.startsWith("SH"));             // true
		
//		8.EndSWITH:- THAT STRING IS ends WITH MENTIONED LETTERS OR NOT
		
//		String a = "SHUBHAM";
//		System.out.println(a.endsWith("am"));             //false
//		System.out.println(a.endsWith("AM"));             // true
		
//		9. SubString:- For print word start with index number--------
		
//		String a = "ShubhamPawar";
//		
//		System.out.println(a.substring(0));
//		System.out.println(a.substring(3));
//		System.out.println(a.substring(7));
		
//		10.SubString (Start_index,End_index):-Shows Word in between start and end index number
//		
//		String a = "ShubhamPawar";
//		System.out.println(a.substring(0,12));
//		System.out.println(a.substring(0,7));
//		System.out.println(a.substring(7,12));
//		
//		11. Trim:--Used to remove extra spaces in between name
		
//		String a = "    Shubham Pawar     ";
//		System.out.println(a);
//		System.out.println(a.trim());
		
		
		
//		Q:- Java program to find reverse of the string "Shubham"
		
		String a = "SHUBHAM";
		String b = "";
		char x;
		
		for (int i = 0; i<a.length(); i++)
		{
			x = a.charAt(i); 
			b = x+b;
			
//			b = b+x;     for this print is forward way.
			
//			0 -> S :: B = S;          1ST LOOP
//			1 -> h :: B = HS          2ND LOOP
//			2 -> U :: B = UHS;        3RD LOOP  LIKE THAT VALUES ARE PRINTED
						
		}
		System.out.println(b);
		
		
		
		
		
		
		
		
		
		
	}

}
