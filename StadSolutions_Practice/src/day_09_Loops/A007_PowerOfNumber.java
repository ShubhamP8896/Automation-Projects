package day_09_Loops;

public class A007_PowerOfNumber 
{
	public static void main(String[] args) 
	{
		int base = 5;
		int power = 3;
		int result = 1;
		int i = 1;
		
		while(i <= power)
		{
			result = base*result;
			i++;
		}
		System.out.println(result);
		
	}

}
