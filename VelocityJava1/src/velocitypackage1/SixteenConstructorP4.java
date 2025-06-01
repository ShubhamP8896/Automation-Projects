package velocitypackage1;

public class SixteenConstructorP4 
{
//	Second (Static elements)------------------------------
	static int x = 20;
	static int y = 30;
	static int z = x + y;
	
//	Third :---- Non-Static Elements :------------------
	int p = 50;
	int q = 40;
	int r = p + q;
	
	
	public static void main(String[] args)
	{
//		First ------------------------------
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
		
//		Second ----------------------------- we not able to call this without static
		System.out.println(z);
//		OR
		System.out.println(SixteenConstructorP4.z);
		
//		Third -------------------------- We need to create Object	
//		System.out.println(r); -------------------------Not Possible
		
		SixteenConstructorP4 H = new SixteenConstructorP4();
		System.out.println(H.r);
		
	}

}
