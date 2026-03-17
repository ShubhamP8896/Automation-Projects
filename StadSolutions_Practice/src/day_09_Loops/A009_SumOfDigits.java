package day_09_Loops;

public class A009_SumOfDigits 
{

	public static void main(String[] args) 
	{	
		int num = 1234;
		int sum = 0;
		
		while(num>0)
		{
			sum=sum+num%10;   // 
			num = num/10;     //
		}
		System.out.println(sum);
		
		int num11 = 10101;
		int sum1 = 0;
		for(; num11 > 0;)
		{
			sum1 = sum1+num11%10;
			num11 = num11/10;
		}
		System.out.println(sum1);
	}
}
