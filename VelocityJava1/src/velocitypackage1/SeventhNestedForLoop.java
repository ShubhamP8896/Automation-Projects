package velocitypackage1;

public class SeventhNestedForLoop 
{
	
	public static void main (String[] args)
	{
//		#} Nested For Loop :--------------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
//		Q:--> Show Seven days in Three weeks ---------------------------------------------
		
//		int Week=3; 
//		int Days=7;
//		
//		for(int i=1; i<=Week; i++)
//		{
//			System.out.println("Week-"+i);
//			
//			for(int j=1;j<=Days;j++)
//			{
//				System.out.println("Day-"+j);
//			}
//		}
//		
//		Q: There are 5 Societies and 5 Flats in each society and milk distributer wants to go in each flat--------
		
//		int TotalSocities = 5;
//		int TotalFlats = 5;
//		
//		for (int i=1; i<=TotalSocities; i++)
//		{
//			System.out.println("Society Number - "+i);
//			for (int j=1; j<=TotalFlats; j++)
//			{
//				System.out.println("Flat Number - "+j);
//			}
//		}
		
// Q: Type * five times in one row and five times in one column--------------------
		
//		for (int i=1; i<=5; i++)
//		{	
//			for (int j=1; j<=5; j++)
//			{
//				System.out.print("* ");                      // Not goes in next row with print .
//			}
//			System.out.println();                            // for Next line
//		}

//		There are as per societies number that socities have that numbers of flats in that society
//		If society 1 = flat 1; Society 2 = Flat 1 . 2 ; like that Society 5 = Flat 1, 2, 3, 4, 5 :
		
//		int societies=5;  
//		
//		for(int i=1; i<=societies; i++)
//		{
//			System.out.println("societies -" +i);
//			for (int j=1; j<=i; j++)
//			{
//				System.out.println("Flat - " +j);
//			}
//		}
//		
//		for (int i=1; i<=5; i++)
//		{	
//			for (int j=1; j<=i; j++)
//			{
//				System.out.print("* ");                      // Not goes in next row with print .
//			}
//			System.out.println();                            // for Next line
//		}
//		
		
//		for (int i=5; i>=1; i--)
//		{	
//			for (int j=1; j<=i; j++)
//			{
//				System.out.print("* ");                      // Not goes in next row with print .
//			}
//			System.out.println();                            // for Next line
//		}
//		for (int i =1; i <=5; i++)
//		{
//			for (int j = 1 ; j<=i ; j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//				
//		for (int i =5; i >=1; i--)
//		{
//			for (int j = 1 ; j <=i ; j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
//		{
//	       int i,j; int n=5;
//	  
//	        // outer loop to handle rows
//	        for (i = n; i >= 1; i--) 
//	        {
//	  
//	            // inner loop to print spaces.
//	            for (j = 1; j < i; j++) 
//	            {
//	                System.out.print(" ");
//	            }
//	  
//	            // inner loop to print stars.
//	            for (j = 0; j <= n - i; j++) 
//	            {
//	                System.out.print("*");
//	            }
//	  
//	            // printing new line for each row
//	            System.out.println();
//	        }
//	    }
		
		
		
		
		
//			From left side star pattern:--------------------
//		int n=10;
//		for (int i=n; i>=1; i--)
//		{
//			for (int j = 1; j<i;j++)
//			{
//				System.out.print(" ");
//			}
//			for (int j=0; j<= n-i; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//			From center pattern:--------------------
//		int n=10;
//		for (int i=n; i>=1; i--)
//		{
//			for (int j = 1; j<i; j++)
//			{
//				System.out.print(" ");
//			}
//			for (int j=0; j<= n-i; j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		int n=1;
		for (int i=n; i<=10; i++)
		{
			for (int j = 1; j<i; j++)
			{
				System.out.print(" ");
			}
			for (int j=10; j>= n+i;j--)
			{
				System.out.print("*");  
			}
			System.out.println();
		}
		
		
		
		
		
	}
}