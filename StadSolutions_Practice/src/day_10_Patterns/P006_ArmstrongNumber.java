package day_10_Patterns;

public class P006_ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		int num = 371;
		int temp = num;
		int sum = 0;
		
		while(temp>0)
		{
			int digit = temp%10;
			
			sum = (digit*digit*digit) + sum;
			
			temp = temp/10;
		}
		
		String result = (sum==num)? "Yes" : "No";
		System.out.println("number is Armstrong: " + result);
		
	}
	
}