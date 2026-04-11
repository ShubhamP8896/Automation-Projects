package day_09_Loops;

public class A006_Factorial 
{
	public static void main(String[] args) {
		
		int num = 5;
		int fact = 1;
		while(num>=1)
		{
			fact = fact*num;   
			num--;
		}
		System.out.println(fact);
		
		
		int fact1 = 1;
		for(int i = 1; i<=5; i++)
		{
			fact1=fact1*i;
		}
		System.out.println(fact1);
	}

}
