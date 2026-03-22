package day_11_Arrays;

public class A015 
{
	public static void main(String[] args) 
	{
		int [] a = {9,1,5,8,3,7,1,0};
		
//		Arrays.sort(a); // this is inbuilt method
		
//		We can do this without using the inbuilt method
		
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a.length -1; j++  ) 
			{
				if(a[j] > a[j + 1]) 
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
