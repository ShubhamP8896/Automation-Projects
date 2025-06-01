package velocitypackage1;

public class EighteenThisKeywordPrg1 
{
	int a;                // global variable  (Blue color)
	
//	Constructor
	public EighteenThisKeywordPrg1(int a)     // Local variable (Brown Color)
	{
		this.a=a;             // In this this.a is indicate global variable and a indicate Local variable
		System.out.println(a);
	}
	
	public static void main(String[] args)
    {
		EighteenThisKeywordPrg1 A = new EighteenThisKeywordPrg1(10); // This 10 consider as a value (a=10)	
	}
	
	
	
	
	
}
