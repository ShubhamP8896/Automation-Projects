package day_10_Patterns;

public class P003 
{
	public static void main(String[] args) 
	{
		
		/*
		    ABCDEFGGFEDCBA
			ABCDEF  FEDCBA
			ABCDE    EDCBA
			ABCD      DCBA
			ABC        CBA
			AB          BA
			A            A
		 */
		int n = 7;
		
		for(int i = 0; i < n; i++)
		{
//			Right Pattern
			for(int j = 0; j < n-i; j++)
			{
				System.out.print((char) (65 + j));
			}		
//			Spaces
			for(int k=0; k < 2*i; k++ )
			{
				System.out.print(" ");
			}
//			Left Pattern
			for(int l = n-i-1; l >= 0; l--)
			{
				System.out.print((char) + (65+l) );
			}
			System.out.println();
		}
		
	}

}
