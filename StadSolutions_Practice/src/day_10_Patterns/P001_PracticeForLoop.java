package day_10_Patterns;

public class P001_PracticeForLoop
{
	public static void main(String[] args) {
		
		for(int i=1; i<=3; i++)
		{
			System.out.println("Week :" + i);
			for(int j=1; j<=7; j++)
			{
				System.out.print("Day: " + j + " ");
			}
			System.out.println();
		}
		
		
		System.out.println("----------------------");
//		5 flats in 5 societies

		for(int i = 1; i <= 5 ; i++)
		{
			System.out.println("Society: " + i);
			
			for(int j = 1; j <=5; j++)
			{
				System.out.print("Flat No: " + j  + " ");
			}
			System.out.println();
		}
		
		for(int i = 1; i <= 5; i++ )
		{
			System.out.println("Society No: " + i);
			for(int j = 1; j <= i; j++)
			{
				System.out.print("Flat No: " + j + " ");
			}
			System.out.println();
		}
		
		int n = 5;
		for(int i = n; i >= 1; i--)
		{
			for(int j = 1; j<i; j++)
			{
				System.out.print(" ");
			}
			for(int j = 0; j <=n-i ; j++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
