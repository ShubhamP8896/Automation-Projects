package day_09_Loops;

public class P007_PalindromeNumber 
{
	public static void main(String[] args) 
	{
		int ogNum = 151;
		int num = ogNum;
		int rev = 0;
		while(num>0)
		{
			int digit = num%10;
			
			rev = rev*10+digit;
			
			num = num/10;
		}
		System.out.println(rev);
		
		
		
		
	}

}
