package day_08_whileLoop;

public class A004_1_10_EvenNumbers 
{
	public static void main(String[] args) 
	{
		int a = 2;
		while(a<=10)
		{
			System.out.println(a);
			a=a+2;
		}

		int b=1;
		while(b<=10)
		{
			if(b%2 == 0)
			{
				System.out.println(b);
			}
			b++;
		}
		
		int c = 1;
		do
		{
			
		}
		while(c<10);
	
	}
}
