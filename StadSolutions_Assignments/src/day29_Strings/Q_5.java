package day29_Strings;

import java.util.Scanner;

public class Q_5 {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	
	System.out.println("Give me String");
	String Name = input.nextLine();
	
	System.out.println("Give me character to find in string");
	char Character = input.next().charAt(0);
	
	int count = 0;
	
	for(int i = 0; i<Name.length();i++)
	{
		if (Character == Name.charAt(i))
		{
			count = count + 1 ;         //For write count++
		}
	}
	
	if(count > 0)
	{
		System.out.println(Character + " Found in the String : " + Name + " At index " + Name.indexOf(Character) + " and the number of times = " + count );
	}
	else
	{
		System.out.println(Character + " is not found in the String : " + Name);
	}
	
	input.close();
}
}
