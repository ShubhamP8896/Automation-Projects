package day_06_if_ifElse_ifElseLadder_NestedId_SwitchCase;

public class Practice_1
{
	
	public static void main(String[] args) 
	{
		int a [] = {20,5,6,8,2,1,9,6,4,10};
		int min = a[0];
		int max = a[0];
		
		for(int i : a)
		{
			if(min>i)
			{
				min = i;
			}
		}
		System.out.println(min);
		
		for(int i = 0; i<a.length; i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
