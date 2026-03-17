package day_06_if_ifElse_ifElseLadder_NestedId_SwitchCase;

public class A002_MaxNumberBetweenThree 
{
	public static void main(String[] args) 
	{
		int a = 150;
		int b = 250;
		int c = 260;
		
		if(a>b && a>c)
		{
			System.out.println("A is Greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("B is Greater");
		}
		else
		{
			System.out.println("C is Greater");
		}
		
	}

}
