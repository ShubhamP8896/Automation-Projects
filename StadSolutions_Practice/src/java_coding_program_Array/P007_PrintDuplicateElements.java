package java_coding_program_Array;

public class P007_PrintDuplicateElements 
{
	public static void main(String[] args) 
	{
		int arr [] = {5,5,3,2,6,3,4,9,8,6};
		
		for(int i = 0 ; i < arr.length; i++)
		{
			boolean isDuplicate = false;
			
			for(int j = 0; j < i; j++)
			{
				if(arr[i] == arr[j])
				{
					isDuplicate = true;
				}
			}
			if(isDuplicate)
			{
				System.out.print(arr[i] + " ");
			}
		}
		
	}

}
