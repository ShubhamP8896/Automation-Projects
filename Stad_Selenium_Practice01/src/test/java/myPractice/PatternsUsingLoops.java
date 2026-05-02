package myPractice;

import java.util.Arrays;

public class PatternsUsingLoops 
{
	public static void main(String[] args) 
	{
		String st = "Automation";
		
		for(int i = st.length()-1; i>=0 ; i-- )
		{
			System.out.print(st.charAt(i));
		}
		
		System.out.println();
		
		for(int i = 0; i < 5; i++)
		{
			for(int k = 4 - i; k > 0; k--)
			{
				System.out.print(" ");
			}
			
			for(int j = 0; j <= i ; j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 5; i > 0 ; i--)
		{
			for(int j = 5-i; j > 0; j--)
			{
				System.out.print(" ");
			}
			for(int k = i; k >0; k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i<5; i++)
		{
			for(int j = 0; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		int num = 1;
		int sum = 0;
		
		while(num<=10)
		{
			if(num%2 ==0)
			{
				sum = num+sum;
			}
			num++;
		}
		System.out.println(sum);
		
		String st1 = "Hello Shubham";
		
		StringBuilder sb = new StringBuilder(st1);
		System.out.println(sb.reverse());
		
		String s = "Shubham Pawar";
		
		String[] sa = s.split(" ");
		
		for(String ar : sa)
		{
			System.out.print(ar);
		}
		
		System.out.println();
		
		String s2 = "i love automation";
		
		System.out.println(st.indexOf('i'));
		
		
		
	}

}
