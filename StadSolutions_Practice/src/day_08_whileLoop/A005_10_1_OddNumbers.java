package day_08_whileLoop;

public class A005_10_1_OddNumbers 
{
	public static void main(String[] args) {
		int num = 10;
		
		while(num>0)
		{
			if(num%2 != 0)
			{
				System.out.println(num + " is odd");
			}
			num--;
		}
		
		int num2 = 9;
		
		while(num2>0)
		{
			if(num2%2 != 0)
			{
				System.out.println(num2 + " is odd");
			}
			num2 = num2 - 2 ;
		}
	}

}
