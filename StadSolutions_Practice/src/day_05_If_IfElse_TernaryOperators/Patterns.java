package day_05_If_IfElse_TernaryOperators;

import java.util.Scanner;

public class Patterns
{
	public static void main(String[] args) 
	{
		for(int i = 0; i <= 6; i++)
		{
			for(int j = 1; j <= 7-i; j++)
			{
				System.out.print((char)(64+j));
			}
			
			for(int k = 0; k <= i*2-1; k++)
			{
				System.out.print(" ");
			}
			
			for(int l = 7-i; l >= 1; l--)
			{
				System.out.print((char)(64+l));
			}
			
			System.out.println();

		}
		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("Please add the marks: ");
//		
//		int marks = input.nextInt();
//		
//		String result = (marks>40)?"Candidate Passed":"Candidate Failed";
//		System.out.println(result);
//		
		
		/**
		 * ABCDEFGFEDCBA
		 * ABCDEF FEDCBA
		 * ABCDE   EDCBA
		 * ABCD     DCBA
		 * ABC		 CBA
		 * AB         BA
		 * A           A
		 */
		
		String browser = "firefox";
		
		switch(browser.trim().toLowerCase())
		{
		case "chrome": System.out.println("Chrome"); break;
		case "firefox": System.out.println("Firefox"); break;
		case "safari": System.out.println("Safari"); break;
		case "edge": System.out.println("Edge"); break;
		default: System.out.println("Invalid browser");
		}
		
		int year = 2034;
		if((year%400 == 0) || (year%4 == 0 && year%100 != 0))
		{
			System.out.println(year + " is leap year");
		}
		else
		{
			System.out.println(year + " is not leap year");
		}
		
		char a ='A';
		
		if(a>64 && a<91)
		{
			System.out.println("Upper");
		}
		else if(a>47 && a<58)
		{
			System.out.println("Number");
		}
		else if(a>96 && a<123)
		{
			System.out.println("Lower");
		}
		else
		{
			System.out.println("Symbol");
		}
		
		int num = 1;
		while(num<=10)
		{
			if(num%2 != 0)
			{
				System.out.println(num);
			}
				
				num++;
		}
		
		int number = 568951;
		int rev;
		while(number>0)
		{
			rev = number%10;
			number = number/10;
			System.out.print(rev);
		}
		
		
	}

}
