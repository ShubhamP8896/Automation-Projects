package java_coding_program_Array;

public class P009_MoveZeros_LeftSide 
{
	public static void main(String[] args) {
		
		int arr [] = {0,2,5,6,0,0,1,0,3,0,9,0,5,8};
		int n = arr.length;
		int zeroCount = 0;
		
		for(int i = 0; i < n; i++)
		{
			if(arr[i] == 0)
			{
				zeroCount++;
			}
		}
		
		int index = zeroCount;
		
		int result [] = new int [n];
		
		for(int i = 0; i < n; i++)
		{
			if(arr[i] != 0)
			{
				result[index] = arr[i];
				index++;
			}
		}
		
		for(int num : result)
		{
			System.out.print(num + " ");
		}
		
		
	}

}
