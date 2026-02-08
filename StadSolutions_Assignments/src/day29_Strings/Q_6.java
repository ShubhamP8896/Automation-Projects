package day29_Strings;

import java.util.Scanner;

public class Q_6 {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	
	System.out.println("Give me String");
	String Name = input.nextLine();
	
	for(int i = Name.length() - 1 ; i>=0 ; i--)
	{
		System.out.print(Name.charAt(i));
	}
	
	System.out.println();
	System.out.println("--------------------");
	
//	Or used this also
	
	StringBuilder Str = new StringBuilder(Name);
	System.out.println(Str.reverse());

	
	input.close();
}
}
