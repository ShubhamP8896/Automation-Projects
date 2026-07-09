package day_11_Arrays;

import java.util.Arrays;

public class P001_SecondLargestArray 
{
	public static void main(String[] args) 
	{
		int[] a = {10, 25, 7, 40, 15, 27};

        int largest = a[0];
        int secondLargest = a[0];
        
        int min = Integer.MAX_VALUE;
        int secMin  = Integer.MAX_VALUE;

        for (int i = 1; i < a.length; i++) 
        {
            if (a[i] > largest) {
                secondLargest = largest;
                largest = a[i];
            } 
            else if (a[i] > secondLargest && a[i] != largest) 
            {
                secondLargest = a[i];
            }
        }
        
        for(int j = 0; j < a.length; j++)
        {
        	if(a[j] < min)
        	{
        		secMin = min;
        		min = a[j];
        	}
        	else if( a[j] < secMin && a[j] != min )
        	{
        		secMin = a[j];
        	}
        }

        System.out.println("Second largest value: " + secMin);
		
	}

}
