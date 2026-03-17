package day_08_whileLoop;

public class A003_1_10_OddNumbers 
{
	public static void main(String[] args) {
		int num = 1;
		
		System.out.println("Following are the Odd numbers");
		while(num<=10)
		{	
			System.out.println(num);
			num = num+2;
		}
		
		int num2 = 1;
		System.out.println("Following are the Odd numbers");
		while(num2<=10)
		{
			if(num2%2 != 0)
			{
				System.out.println(num2);	
			}
			num2++;
		}
		
	}

}
