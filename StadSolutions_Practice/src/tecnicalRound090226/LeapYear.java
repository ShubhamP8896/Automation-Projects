package tecnicalRound090226;

import java.util.Scanner;

public class LeapYear 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please add year: ");
		
		int year = input.nextInt();
		
		if( (year%4 == 0 && year%100 != 0) || (year%400 == 0) )
		{
			System.out.println(year + " : given year is leap year");
		}
		else
		{
			System.out.println(year + " : is not leap year");
		}
		
	}

}
