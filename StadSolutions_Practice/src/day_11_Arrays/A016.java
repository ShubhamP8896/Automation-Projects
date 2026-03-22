package day_11_Arrays;

public class A016
{
	public static void main(String[] args) 
	{		
		int [] a = {3,1,5,2,6,9,8,4};
		
	//Sort array in the descending order
	
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a.length-1; j++ )
			{
				if(a[j]<a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		for(int num : a)
		{
			System.out.print(num + " ");
		}		
		
	}
}
