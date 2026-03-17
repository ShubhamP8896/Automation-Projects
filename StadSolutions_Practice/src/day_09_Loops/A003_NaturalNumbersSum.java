package day_09_Loops;

public class A003_NaturalNumbersSum
{
	public static void main(String[] args) {
		int count = 1;	
		int sum = 0;
		
		while(count<=10)
		{
			sum = sum+count;
			count++;
		}
		System.out.println("Sum of 1-10 natural number = " + sum);
		
		int count1 = 1;	
		int sum1 = 0;
		for(;count1<=10;count1++)
		{
			sum1=sum1+count1;
		}
		System.out.println(sum1);
		
		int count2 = 1;	
		int sum2 = 0;
		do {
			sum2 = sum2+count2;
			count2++;
		}while(count2<=10);
		System.out.println(sum2);
		
	}

}
