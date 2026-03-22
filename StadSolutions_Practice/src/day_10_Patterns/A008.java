package day_10_Patterns;

public class A008 
{
	public static void main(String[] args) {
		/*
		 *       *
		 *      * *
		 *     * * *
		 *    * * * *
		 *   * * * * *
		 */
		
		for(int i = 1; i <= 10; i++)
		{
			for(int j = 10-i; j >= 1; j--) 
			{
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
