package day_10_Patterns;

public class P005_PrimeNumberOrNot 
{
	public static void isPrimeNum(int num)
	{
		boolean isPrime = true;
		if(num < 2)
		{
			isPrime = false;
		}
		else
		{
			for(int i = 2 ; i <= num / 2; i ++)
			{
				if(num % i == 0)
				{
					isPrime = false;
					break;
				}
			}
			
		}
		if(isPrime)
		{
			System.out.println(num + " is prime number");
		}
		else
		{
//			System.out.println(num + " is not prime");
		}
	}	
	
	public static void main(String[] args) 
	{
		int num = 0;
		
		while(num<=100)
		{
			P005_PrimeNumberOrNot.isPrimeNum(num);
			num++;
		}
		
		
	}

}
