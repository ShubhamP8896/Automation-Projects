package day29_Strings;

import java.util.Scanner;

public class Q_3 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please Give me Input - 1 ");
	
	String S1 = input.nextLine();
	
	System.out.println("Please Give me Input - 2 ");
	String S2 = input.nextLine();
	
	if(S1.equalsIgnoreCase(S2))
	{
		System.out.println(S1 + " and " + S2 + " both strings are equal");
	}
	else
	{
		System.out.println(S1 + " and " + S2 +" Strings are Different");
	}
	input.close();
	}

}
