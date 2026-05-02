package practiceExam040226;

import java.util.Arrays;

public class JaggedArray1 
{
	public static void main(String[] args) 
	{
		
//		it means having the fixed rows but different columns for each row
		int a [ ] [] = new int [4][];
		
//		here we assign the columns for each row
		a[0] = new int [2];
		a[1] = new int [4];
		a[2] = new int [1];
		a[3] = new int [3];
		
//		Assign the values
		a[0][0] = 1; a[0][1] = 1;
		a[1][0] = 1; a[1][1] = 1; a[1][2] = 1; a[1][3] = 1;
		a[2][0] = 1;
		a[3][0] = 1; a[3][1] = 1; a[3][2] = 1;
		
		System.out.println(Arrays.deepToString(a));
		
//		for loop
		for(int i = 0; i<a.length; i++)
		{
			for(int j = 0; j<a[i].length; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
//		for each loop
		for(int ele[] : a)
		{
			for(int v : ele)
			{
				System.out.print(v+ " ");
			}
			System.out.println();
		}
		
//		initialization and declaration
		int b[][] = {{1,2,3},{4,5},{6,7,8,9}};
		
		System.out.println(Arrays.deepToString(b));
		
		
		
	}

}
