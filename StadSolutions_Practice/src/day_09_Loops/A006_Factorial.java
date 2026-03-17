package day_09_Loops;

public class A006_Factorial 
{
	public static void main(String[] args) {
		
		int num = 1;
		int fact = 1;
		while(num<=5)
		{
			fact = fact*num;   
			num++;
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
