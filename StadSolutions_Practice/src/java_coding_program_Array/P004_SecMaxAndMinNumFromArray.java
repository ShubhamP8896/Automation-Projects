package java_coding_program_Array;

public class P004_SecMaxAndMinNumFromArray
{
	public static void main(String[] args) {
		
		int arr [] = {9,2,3,8,6,4,1,7};
		
		int max = Integer.MIN_VALUE;
		int secMax = arr [0];
		int min = Integer.MAX_VALUE;
		int secMin = arr [0];
		
		for( int i = 0; i < arr.length; i++)
		{
			if(max<arr[i])
			{
				secMax = max;
				max = arr[i];
			}
			else if(secMax < arr[i] && secMax != max)
			{
				secMax = arr[i];
			}
//			For min and second min
			if(min>arr[i])
			{
				secMin = min;
				min = arr[i];
			}
			else if(secMin > arr[i] && secMin != min)
			{
				secMin = arr[i];
			}
		}
		
		System.out.println("Max: " + max);
		System.out.println("Second Max: " + secMax);
		System.out.println("Min: " + min);
		System.out.println("Second Min: " + secMin);
		
	}
	

}
