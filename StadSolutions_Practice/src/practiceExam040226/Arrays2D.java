package practiceExam040226;

import java.util.Arrays;

public class Arrays2D
{
	public static void main(String[] args) 
	{
		int a [] [] = new int [3][4];   // 3 rows and 4 columns
		
//		Assign Values
		a[0][0] = 5;
		a[0][1] = 64;
		a[0][2] = 10;
		a[0][3] = 8;
		
		a[1][0] = 5;
		a[1][1] = 64;
		a[1][2] = 10;
		a[1][3] = 8;
		
		a[2][0] = 5;
		a[2][1] = 64;
		a[2][2] = 10;
		a[2][3] = 8;	
		
//		Direct print Array
		System.out.println(Arrays.deepToString(a));
		
//		using for loop
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j<a[i].length; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
//		using for each loop
		for(int [] row : a )
		{
			for(int ele : row)
			{
				System.out.print(ele + " ");
			}
			System.out.println();
		}
		
//		We can assign values directly
		
		int c [] [] = {{1,2,3,4},{5,6,7},{8,9},{10}};
		System.out.println(Arrays.deepToString(c));
		
	}

}
