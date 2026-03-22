package day_11_Arrays;

import java.util.Arrays;

public class A008 
{
	public static void main(String[] args) {
		int a [] = {1,5,3,4,7,9,8};
		
		int b [] = new int [a.length];
		
		for(int i = 0; i < a.length; i++)
		{
			b[i] = a[i];
		}
		
		System.out.println(Arrays.toString(b));
		
	}

}
