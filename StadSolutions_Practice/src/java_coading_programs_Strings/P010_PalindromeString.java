package java_coading_programs_Strings;

public class P010_PalindromeString 
{
	public static void main(String [] a)
	{
		String og = "Radar";
		String rev = new StringBuilder(og).reverse().toString();
		
		if(og.toLowerCase().equals(rev.toLowerCase()))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
//		OR
		System.out.println("----------------");
		
		String org = "Radar";
		String reve = "";
		
		for(int i = org.length()-1; i >= 0; i--)
		{
			reve = reve + org.charAt(i);
		}
		
		System.out.println("Original String : " + org );
		System.out.println("Reverse String : " + reve );
		
		if(org.toLowerCase().equals(reve.toLowerCase()))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
	}

}
