package day_09_Loops;

public class A005_Sum_OddNumbers 
{
	public static void main(String[] args) 
	{
		int a = 1;
		int sum = 0;
		
		while(a<=50)
		{
			if(a%2 != 0 )
			{
				sum = sum+a;
			}
			a++;
		}
		System.out.println(sum);
		
		int sum1 = 0;
		for(int i = 1; i<=50; i++)
		{
			if(i%2 != 0)
			{
				sum1=sum1+i;
			}
		}
		System.out.println(sum1);
	}
	
	

}
