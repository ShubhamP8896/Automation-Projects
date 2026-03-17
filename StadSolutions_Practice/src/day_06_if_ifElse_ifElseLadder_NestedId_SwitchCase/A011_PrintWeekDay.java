package day_06_if_ifElse_ifElseLadder_NestedId_SwitchCase;

public class A011_PrintWeekDay
{
	public static void main(String[] args)
	{
		int date = 5;
		
			switch (date) 
			{
			case 1: System.out.println("Monday");
				break;
			case 2 : System.out.println("Tuesday");
				break;
			case 3 : System.out.println("Wednesday");
				break;
			case 4 : System.out.println("Thursday");
				break;
			case 5 : System.out.println("Friday");
				break;
			case 6 : System.out.println("Saturday");
				break;
			case 7 : System.out.println("Sunday");
				break;
			default: System.out.println("Invalid Date");
				break;
			}
	}

}
