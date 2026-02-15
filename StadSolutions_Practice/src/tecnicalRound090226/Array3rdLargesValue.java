package tecnicalRound090226;

import java.util.Arrays;

public class Array3rdLargesValue 
{
	public static void main(String[] args) 
	{
		int [] num = {10,15,20,4,6};
		
		 for (int i = 0; i < num.length - 1; i++)
		 {
	            // Inner loop for comparisons and swaps
	            for (int j = 0; j < num.length - i - 1; j++) 
	            {
	                if (num[j] > num[j + 1]) {
	                    // Swap arr[j] and arr[j+1]
	                    int temp = num[j];
	                    num[j] = num[j + 1];
	                    num[j + 1] = temp;
	                }
	            }
	            System.out.println(Arrays.toString(num));
		
		int [] num2 = new int [num.length];
		int j = 0;
		System.out.println(num.length);

		for(int m = num.length - 1; m >= 0; m--)
		{
			num2[j] = num[m];
			j++;
		}
		System.out.println(Arrays.toString(num2));
		System.out.println(num2[2]);

	}
	}
}
