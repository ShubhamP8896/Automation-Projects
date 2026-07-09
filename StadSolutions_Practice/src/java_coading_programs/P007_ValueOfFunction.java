package java_coading_programs;

public class P007_ValueOfFunction 
{

	public static void main(String[] args) {
		
//		How to convert int into String
		
		int  i = 5685;
		String is = String.valueOf(i);	
		System.out.println(is);
		
//		How to convert String into int
		
		String s = "Shubham123";
		int si = Integer.parseInt(s);
		
//		How to convert Char Array into String
		char c [] = {'s','h','u','b'};
		String ch = String.valueOf(c);
		
//		How to convert String into char Array
		String str = "Pawar";
		char [] ct = str.toCharArray(); 
		
//		Get the Actual Numeric Value which is in char
		
		char num = '5';
		int numb = num - '0';
//		OR
		int n = Character.getNumericValue(num);  // this will directly get the numeric value
		
//		1. Get the ASCII / Unicode Value
		char cha = 'A';
		int ascii = (int) cha; // Result: 65
		
//		Convert int into Char
		int ascii1 = 65;
		char ch1 = (char) ascii1; // Result: 'A'
		
//		OR
		
		int num1 = 5;
		char ch2 = (char) (num1 + '0'); // Result: '5'
		
//		How to Know the character is number or not
		Boolean result = Character.isDigit(ch2);
		
		System.out.println(result);
		
		
	}
	

}
