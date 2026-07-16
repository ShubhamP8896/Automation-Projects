package java_coding_program_Numerics;

public class P0003_PalindromeNumber 
{
	public static void main(String[] args) 
	{	
		int num = 123321;
		int temp = num;
		int rev = 0;
		
		while(temp>0)
		{
			rev = rev*10+temp%10;
			temp = temp/10;
		}
		
		if(num==rev)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is not Palindrome");
		}
		
		
		
	}

}
