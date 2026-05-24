package day_10_Patterns;

public class P008PerfectNum 
{
	public static void main(String[] args) 
	{
		int ogNum = 6;
		int num = ogNum;
		int sum = 0;
		
			for(int i = 1; i<ogNum; i++)
			{
				if(ogNum%i == 0)
				{
					sum = sum+i;
				}
			}
			System.out.println(sum);
			
			if(sum==num)
			{
				System.out.println("Number is perfect Number: " + ogNum);
			}
		
			
	
	}

}
