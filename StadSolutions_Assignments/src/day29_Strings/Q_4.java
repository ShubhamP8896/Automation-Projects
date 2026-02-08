package day29_Strings;

import java.util.Scanner;

public class Q_4 {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	
	System.out.println("Give me String");
	String Name = input.nextLine();
	
	System.out.println("Give me character to find in string");
	char Character = input.next().charAt(0);
	
	boolean found = false;
	
	for(int i = 0; i<Name.length();i++)
	{
		if (Character == Name.charAt(i))
		{
			found = true;
			break;
		}
	}
	
	if(found)
	{
		System.out.println(Character + " Found in the String : " + Name + " At index " + Name.indexOf(Character));
	}
	else
	{
		System.out.println(Character + " is not found in the String : " + Name);
	}
	
	
	input.close();
}
}
