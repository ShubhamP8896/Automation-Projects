package day_10_Patterns;

public class P004 
{
	public static void main(String[] args) {
		int n = 7;
		for(int i=0; i < n; i++)
		{
			for(int j = 0; j < n-i; j++)
			{
				System.out.print((char)+(65+j));
			}
			for(int k = 0 ; k < i ; k++)
			{
				System.out.print("  ");
			}
			for(int l = n-i-1; l >= 0 ; l--)
			{
				System.out.print((char)+(65+l));
			}
			System.out.println();
		}
	}

}
