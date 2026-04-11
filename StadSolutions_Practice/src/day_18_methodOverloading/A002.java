package day_18_methodOverloading;

public class A002 
{
	int sum(int a, int b)
	{
		return a+b;
	}

	int sum(int a, int b, int c)
	{
		return a+b+c;
	}
	
	public static void main(String[] args) {
		A002 obj = new A002();
		
		int sumOf2 = obj.sum(5, 3);
		
		System.out.println(sumOf2);
		
		int sumOf3 = obj.sum(sumOf2, sumOf2, sumOf2);
		
		System.out.println(sumOf3);
		
	}
	
	
}
