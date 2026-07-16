package java_coading_programs_Strings;

import java.util.Arrays;

public class P011_Anagram 
{
	public static void main(String[] args) {
		String a = "eat";
		String b = "ate";
		
		if(a.length() == b.length())
		{
			char x [] = a.toCharArray();
			char z [] = b.toCharArray();
			Arrays.sort(x);
			Arrays.sort(z);
			
			String p = String.valueOf(x);
			String q = String.valueOf(z);
			
			if(p.equals(q))
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not Anagram");
			}
		}
		else
		{
			System.out.println("Not Anagram");
		}
		
		
//		Or BETTER VERSION
		
		String M = "Listen".toLowerCase();
		String N = "Silent".toLowerCase();

		if (M.length() != N.length()) {
		    System.out.println("Not Anagram");
		    return;
		}

		char[] x = M.toCharArray();
		char[] y = N.toCharArray();

		Arrays.sort(x);
		Arrays.sort(y);

		if (Arrays.equals(x, y)) {
		    System.out.println("Anagram");
		} else {
		    System.out.println("Not Anagram");
		}
		
		
	}

}
