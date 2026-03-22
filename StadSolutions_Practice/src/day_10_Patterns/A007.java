package day_10_Patterns;

public class A007
{
	public static void main(String[] args) {
		for (char i = 'a'; i<='e'; i++)
		{
			for(char j = 'a'; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
