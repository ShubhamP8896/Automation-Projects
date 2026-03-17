package day_09_Loops;

public class A008_ReverseNumber 
{
	public static void main(String[] args) {
		int num = 85421;
		int rev = 0;
		
		while(num>0)
		{
			rev = num%10; //1 , 2 
			num = num/10;  //8542
			System.out.print(rev);
		}
		
		
		
	}

}
