package day_16Methods;

public class A008
{

	public boolean isLeapYear(int year)
	{
		if((year%4 == 0 && year%100 != 0) || (year%400 == 0))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	
	public static void main(String[] args) {
		A008 obj = new A008();
		
		boolean result = obj.isLeapYear(2024);
		
		System.out.println(result);
		
		if(result == true )
		{
			System.out.println("Given year is leap year");
		}
		else
		{
			System.out.println("Given year is not leap year");
		}

	}
	
	
}
