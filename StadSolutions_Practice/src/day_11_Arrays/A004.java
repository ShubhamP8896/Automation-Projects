package day_11_Arrays;

public class A004 	
{
	public static void main(String[] args) {
		int a [] = {5,7,8,1,3,4};
		int max = a[0];
		int min = a[0];
		
		for(int i : a)
		{
			if(max < i)
			{
				max = i;
			}
		}
		System.out.println("max Value: " + max);
		
		for(int i : a)
		{
			if(min > i)
			{
				min = i;
			}
		}
		System.out.println("min Value: " + min);
		
	}
	

}
