package day_09_Loops;

public class P007_PalindromeNumber 
{
	public static void main(String[] args) 
	{
		int ogNum = 151;
		int rev = 0;
		while(ogNum>0)
		{	
			rev = rev*10+ogNum%10;
			
			ogNum = ogNum/10;
		}
		System.out.println(rev);
		
		
		
	}

}
