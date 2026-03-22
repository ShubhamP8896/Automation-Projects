package day_10_Patterns;

public class P002_ForLoop 
{
	public static void main(String[] args) 
	{
		
		for(int i = 1; i <=10; i++)
		{
			System.out.println();
			for(int j = 1; j <= 10; j++)
			{
				System.out.print(j*i + " ");
			}
			System.out.println();
		}
		
	}


}
