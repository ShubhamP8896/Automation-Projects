package java_coding_program_Numerics;

public class P0004_RevNumber 
{
	public static void main(String [] a)
	{
		int num = 153256;
		
		while(num > 0)
		{
			System.out.print(num%10);
			num = num/10;
		}
		
	}

}
