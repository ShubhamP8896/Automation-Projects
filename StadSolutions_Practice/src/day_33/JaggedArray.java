package day_33;

import java.util.Arrays;

public class JaggedArray {
	public static void main(String[] args) {
		
		// Create a Jagged array with 4 rows
        int a[][] = new int[4][];
//                                                                               0   1     2    3
        // Initialize each row with a different number of columns           0 | 2  | 4  |  6 | 8  |
        a[0] = new int[4]; // First row with 4 columns						1 |    |    |
        a[1] = new int[2]; // Second row with 2 columns						2 |    |
        a[2] = new int[1]; // Third row with 1 column						3 |    |    |    |
        a[3] = new int[3]; // Fourth row with 3 columns

        // Assign values to the array 1st row
        a[0][0] = 2;   a[0][1] = 4;   a[0][2] = 6;  a[0][3] = 8; 

//       2nd row 
        a[1][0] = 5;    a[1][1] = 9;
        
//      3rd Row
        a[2][0] = 10;
        
//      4th Row  
        a[3][0] = 8; a[3][1] = 4; a[3][2] = 6;

        // Printing the jagged array
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
 
//		For direct print we used Arrays.deepToString() method of Arrays class.
		
		System.out.println(Arrays.deepToString(a));
	
		
		System.out.println("-----------------------------");
		
//		for each loop
		
		for (int [] row : a)
		{
			for ( int element : row)
			{
				System.out.print(element + " ");
			}
			System.out.println();
		}
		
		System.out.println("---------------------");
		
		System.out.println("Array Literals");
		
		int b [] [] = {{1,2,3,4}, {5,8}, {7,8,9},{1}};
		
System.out.println("Direct Print with arrays method");
System.out.println(Arrays.deepToString(b));

System.out.println();
System.out.println("For Loop");

for (int i = 0; i < b.length; i++)
{
	for (int j =0; j<b[i].length; j++)
	{
		System.out.print(b[i][j]+ " ");
	}
	System.out.println();
}

System.out.println("For Each Loop");

for (int row [] : b)
{
	for (int element : row)
	{
		System.out.print(element + " ");
	}
	System.out.println();
}








	}
}
