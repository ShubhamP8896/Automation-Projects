package day_10_Patterns;

public class A010 
{
	public static void main(String[] args) {
		int n = 5;
		
		for(int i = 1; i <= n ; i++)
		{
			for(int j = n-i; j > 0; j--)
			{
				System.out.print("  ");
			}
			for(int k = 1; k < i+i; k++)
			{
				System.out.print(k + " ");
			}
			System.out.println();
		}		
	}

}
