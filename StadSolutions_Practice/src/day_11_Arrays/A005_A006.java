package day_11_Arrays;

public class A005_A006 
{
	public static void main(String[] args) {
		int a [] = {1,5,6,8,10,2,3,4,7,9};
		
		int evenSum = 0;
		int oddSum = 0;
		
		for(int i : a)
		{
			if(i%2==0)
			{
				evenSum = evenSum+i;
				System.out.println("Even Numbers: "+i);
			}
			else
			{
				oddSum = oddSum+i;
				System.out.println("Odd Numbers: "+i);
			}
		}
		
		System.out.println("Even Sum : " + evenSum);
		System.out.println("Odd Sum: " + oddSum);
	}

}
