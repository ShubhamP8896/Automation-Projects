package java_coding_program_Array;

import java.util.HashSet;
import java.util.Set;

public class P006_PrintUniqElements
{
	public static void main(String[] args) {
		
int ar [] = {1,2,5,6,2,6,3,3,1,9,7,8};
		
		for(int i = 0; i < ar.length; i++)
		{
			boolean isDuplicate = false;
			
			for(int j = 0; j < i; j++)
			{
				if(ar[i] == ar[j])
				{
					isDuplicate = true;
					break;
				}
			}
			if(!isDuplicate)
			{
				System.out.print(ar[i] + " ");
			}
		}
		
		System.out.println();
		System.out.println("----------------------");
		
//		OR using the array
		
		int arr [] = {1,2,5,6,2,6,3,3,1,9,7,8};
        
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i < arr.length; i++) 
        {
            set.add(arr[i]);
        }
        
        System.out.println(set);
		
	}
}
