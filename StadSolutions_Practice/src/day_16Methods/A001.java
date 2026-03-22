package day_16Methods;

public class A001
{
//	with return
	public int smallestNum(int a, int b, int c)
	{
		if(a<b && a<c)
		{
			return a;
		}
		else if(b<a && b<c)
		{
			return b;
		}
		else
		{
			return c;
		}
	}
	
//	without return
	
	public void smallNo(int a, int b, int c)
	{
		if(a<b && a<c)
		{
			System.out.println(a + " : A is smallest");
		}
		else if(b<c && b<a)
		{
			System.out.println(b + " : B is smallest");
		}
		else
		{
			System.out.println(c + " : C is smallest");
		}
	}
	
	
	
	public static void main(String[] args) 
	{
		A001 obj = new A001();
		
		int smallestNo = obj.smallestNum(1, 3, 2);
		
		System.out.println(smallestNo);
		
		obj.smallNo(1, 3, 2);
		
	}
}
