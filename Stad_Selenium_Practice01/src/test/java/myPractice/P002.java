package myPractice;

public class P002 
{
	public static void main(String[] args) {
		
		int[] a = {1, 2, 8, 5, 6, 9, 8, 5, 3, 2};

		int max = a[0];
		int max2 = Integer.MIN_VALUE;

		int min = a[0];
		int min2 = Integer.MAX_VALUE;

		for (int i = 1; i < a.length; i++) 
		{
		    // Largest and second largest
		    if (a[i] > max) 
		    {
		        max2 = max;
		        max = a[i];
		    } else if (a[i] > max2 && a[i] != max) 
		    {
		        max2 = a[i];
		    }

		    // Smallest and second smallest
		    if (a[i] < min) 
		    {
		        min2 = min;
		        min = a[i];
		    } 
		    else if (a[i] < min2 && a[i] != min)
		    {
		        min2 = a[i];
		    }
		}

		System.out.println("Largest         : " + max);
		System.out.println("2nd Largest     : " + max2);
		System.out.println("Smallest        : " + min);
		System.out.println("2nd Smallest    : " + min2);
	}
}
