package day_06_if_ifElse_ifElseLadder_NestedId_SwitchCase;


public class A006_LeapYear 
{
	public static void main(String[] args) {
		
		int year = 2000;
		
		if((year%4 == 0 && year%100 != 0) || (year%400 == 0))
		{
			System.out.println("Year is Leap year");
		}
		else
		{
			System.out.println("Year is not leap year");
		}
		
//		Or we can use the nested If statement as well
		
		if(year % 4 == 0)
		{
		    if(year % 100 == 0)
		    {
		        if(year % 400 == 0)
		        {
		            System.out.println("Leap Year");
		        }
		        else
		        {
		            System.out.println("Not Leap Year");
		        }
		    }
		    else
		    {
		        System.out.println("Leap Year");
		    }
		}
		else
		{
		    System.out.println("Not Leap Year");
		}
		
	}

}
