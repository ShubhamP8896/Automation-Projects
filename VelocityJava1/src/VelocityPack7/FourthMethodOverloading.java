package VelocityPack7;

public class FourthMethodOverloading           // instead of this we use next (fifth) class
// 	This is expample which is noted in my book         Session 19
{
	public static void additionofTwoNumbers()
	{
		int a = 15;
		int b = 25;
		System.out.println(a+b);
	}
	
	public static void additionofTthreeNumbers()
	{
		int a = 15;
		int b = 25;
		int c = 35;
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) 
	{
		FourthMethodOverloading.additionofTwoNumbers();
		
		FourthMethodOverloading.additionofTthreeNumbers();
		
	}
	
	
	
}
