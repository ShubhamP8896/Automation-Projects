package day_16Methods;

public class A002
{
	
	public int largestNum(int a, int b, int c)
	{
		if(a>b && a>c)
		{
			return a;
		}
		else if (b>a && b>c)
		{
			return b;
		}
		else
		{
			return c;
		}
	}
	
public static void main(String[] args) {
	A002 obj = new A002();
	int bigNum = obj.largestNum(8, 8, 9);
	System.out.println(bigNum);
}

}
