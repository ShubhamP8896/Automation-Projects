package day_06_if_ifElse_ifElseLadder_NestedId_SwitchCase;

import java.util.Scanner;

public class A005_Number_Even_OR_Odd 
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please add the number");
		int num = input.nextInt();
		
		if(num%2 == 0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
	
	}

}
