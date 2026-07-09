package day_10_Patterns;

public class P007_StrongNum {
	public static void main(String[] args) 
	{
		int num = 145;
		int sum = 0;
		while(num>0)
		{
			int digit = num%10;
			int fact = 1;
			for(int i=1; i<=digit; i++)
			{
				fact = fact * i;
			}
			
			sum = sum + fact;
			
			num = num/10;
		}
		System.out.println(sum);
		
		
	}

}
