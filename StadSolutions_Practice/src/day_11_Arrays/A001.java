package day_11_Arrays;

public class A001 
{
	public static void main(String[] args) {
		
		int [] num = {1,2,5,10,5,6,4};
		int sum = 0;
		
		for(int number : num)
		{
				sum = sum+number;
		}
		
		System.out.println("Sum of Numbers in the Array: "+sum);
		
		for(int i = num.length-1; i >= 0; i -- )
		{
			
			System.out.print(num[i] +" ");
		}
		
		
	}
	

}
