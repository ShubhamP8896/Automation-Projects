package java_coding_program_Array;

import java.util.Arrays;

public class P002_SortArray 
{
	public static void main(String [] a )
	{
		int arr [] = {2,6,5,3,1,7,4};
		int n = arr.length;
		
		for(int i = 0; i < n-1; i++)
		{
			for(int j = 0; j < n-1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
