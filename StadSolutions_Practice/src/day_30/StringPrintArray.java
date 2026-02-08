package day_30;

public class StringPrintArray 
{
	public static void main(String[] args) {
		
//		how to print thsi string in array form
		String s = "Shubham";
		
		for (int i = 0; i<s.length();i++)
		{
			System.out.print(s.charAt(i));
		}
		
//		Reverse >> there is no any function for the string for print reverse
		System.out.println();
		System.out.println("---------Reverse---------");
		
		for (int i = s.length() - 1; i>=0 ;i--)
		{
			System.out.print(s.charAt(i));
		}
		
		
	}
}
