package day_09_Loops;

public class A004_Sum_EvenNumbers 
{
	public static void main(String[] args) {
		int sum = 0;	
		for(int i = 0;i<=100; i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum + " : Total of even numbers");
		
		int sum1 = 0;
		int count = 0;
		while(count<=100)
		{
			sum1=sum1+count;
			count= count + 2;
		}
		System.out.println(sum1 + " : Total of even numbers");
		
		
		
		
	}
	
	

}
