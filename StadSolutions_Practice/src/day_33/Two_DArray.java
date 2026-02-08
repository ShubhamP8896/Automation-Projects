package day_33;

import java.util.Arrays;

public class Two_DArray {

	public static void main(String[] args) {
						
		int a [][]= new int [3][4];         //3 means row index and 4 means Column's index
		
		a[0][0] = 2;
		a[1][0] = 4;
		a[2][0] = 6;
		
		a[0][1] = 5;
		a[1][1] = 7;
		a[2][1] = 9;
		
		a[0][2] = 1;
		a[1][2] = 3;
		a[2][2] = 5;
		
		a[0][3] = 8;
		a[1][3] = 10;
		a[2][3] = 4;
		
//		For direct print we used Arrays.deepToString() method of Arrays class.
		
		System.out.println("Direct print useing Arrays method");
		System.out.println(Arrays.deepToString(a));
		
		System.out.println("For Loop");
		
//Using the for loop >> we nee 2 for loops 
		
		for (int i = 0; i<a.length; i++)
		{
			for (int j = 0; j<a[i].length; j++)               // we are able to add here direct the length here 4 in place of a[i].length
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("For each loop");
		
//		for each loop
		
		for (int [] row : a)
		{
			for ( int element : row)
			{
				System.out.print(element + " ");
			}
			System.out.println();
		}
		
		
//		Array Literals >> initialization and declaration at same time
		
		System.out.println("Array Literals");
		
		int b[] [] = {{4,2,4,5}, {2,5,8,8},{4,5,9,6}};
		
		System.out.println("Direct print useing Arrays method");
		System.out.println(Arrays.deepToString(b));
		
		System.out.println("For Loop");
		
		//Using the for loop >> we nee 2 for loops 
		
				for (int i = 0; i<b.length; i++)
				{
					for (int j = 0; j<b[i].length; j++)               // we are able to add here direct the length here 4 in place of a[i].length
					{
						System.out.print(b[i][j] + " ");
					}
					System.out.println();
				}
				
				System.out.println("For each loop");
				
//				for each loop
				
				for (int [] row : b)
				{
					for ( int element : row)
					{
						System.out.print(element + " ");
					}
					System.out.println();

	}
	}
}
