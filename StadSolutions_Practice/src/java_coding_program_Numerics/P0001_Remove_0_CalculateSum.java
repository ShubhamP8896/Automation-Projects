package java_coding_program_Numerics;

public class P0001_Remove_0_CalculateSum
{
	/**
	 * You are given an integer n.

Form a new integer x by concatenating all the non-zero digits of n in their original order. If there are no non-zero digits, x = 0.

Let sum be the sum of digits in x.

Return an integer representing the value of x * sum.
	 * 
	 * 
	 * Example 1:

Input: n = 10203004

Output: 12340

Explanation:

The non-zero digits are 1, 2, 3, and 4. Thus, x = 1234.
The sum of digits is sum = 1 + 2 + 3 + 4 = 10.
Therefore, the answer is x * sum = 1234 * 10 = 12340.
	 */	
	public long sumAndMultiply(int n)
	{
		String st = String.valueOf(n);
		long sum = 0;
		long x = 0;
		
		for(char c : st.toCharArray())
		{
			int digit = Character.getNumericValue(c);   // OR  int digit = c - '0';
			
			if(c != '0')
			{
				sum = sum + digit;
				x = x*10 + digit;
			}
		}
		return x * sum;
	}
	
	public static void main (String[] a)
	{
		P0001_Remove_0_CalculateSum ps = new P0001_Remove_0_CalculateSum();
		long result = ps.sumAndMultiply(10203004);
		System.out.println(result);
	}

}
