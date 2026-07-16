package java_coding_program_Numerics;

public class P0002_Febbonacci_Series
{
	public static void main(String[] args) 
	{
/// Febbonacci series up to 10
		
		int first = 0; int sec = 1; int fn = 0; 
				
		while(first<10)
		{
			System.out.println(first);
			fn = first + sec;
			first = sec;
			sec = fn;
		}
		
	}

}
