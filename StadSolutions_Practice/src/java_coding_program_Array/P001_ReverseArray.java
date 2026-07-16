package java_coding_program_Array;

public class P001_ReverseArray 
{
	public static void main(String[] args) 
	{
		int arr [] = {5,3,2,8,6};
		int n = arr.length;

		for(int i = n-1 ; i >= 0 ; i--)
		{
			System.out.print(arr[i] + " ");
		}
	}

}
