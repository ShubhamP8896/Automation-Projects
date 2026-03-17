package day_08_whileLoop;

public class A002_Print10TO1 
{
	public static void main(String[] args) {
		
		int num = 10;
		
		while(num>=1)
		{
			System.out.println(num);
//			num=num-1;  >> it also wor
			num--;
		}
		System.out.println("EOP");
	}

}
