package java_coding_program_Array;

import java.util.Arrays;

public class P010_moveZeros_RightSide 
{
	public static void main(String[] args) {
		int arr [] = {0,2,5,6,0,0,1,0,3,0,9,0,5,8};
		int n = arr.length;
		
		int result [] = new int [n];
		int j = 0;
		
		for(int i = 0; i<n; i++)
		{
			if(arr[i] != 0)
			{
				result[j] = arr[i];
				j++;
			}
		}
		
		System.out.println(Arrays.toString(result));
	}

}
