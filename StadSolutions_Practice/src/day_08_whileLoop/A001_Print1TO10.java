package day_08_whileLoop;

public class A001_Print1TO10 
{
	public static void main(String[] args) {
		
		int num = 1;
		
		while(num<=10)
		{
			System.out.println(num);
//			num=num+1;  >> it also wor
			num++;
		}
		System.out.println("EOP");
	}

}
