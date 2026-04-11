package day_11_Arrays;

public class A010 
{
	public static void main(String[] args) {
		
		int [] a = {5,0,-5,-3,2,9,-1,-9};
		int negative_NumCount = 0;
		int positive_NumCount = 0;
		int zero_Count = 0;
		
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] > 0)
			{
				positive_NumCount = positive_NumCount+1;
				System.out.println("Positive Numbers : " + a[i]);
			}
			else if(a[i]<0)
			{
				negative_NumCount = negative_NumCount+1;
				System.out.println("Negative Numbers : " + a[i]);
			}
			else
			{
				zero_Count = zero_Count+1;
			}
		}
		
		System.out.println("Positive Numbers Count : " + positive_NumCount);
		System.out.println("Negative Numbers Count : "+negative_NumCount);
		System.out.println("Zero Numbers Count : " + zero_Count);
	}

}
