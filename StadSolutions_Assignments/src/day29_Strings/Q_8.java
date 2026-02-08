package day29_Strings;

import java.util.Scanner;

public class Q_8 {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	
	System.out.println("Give me String");
	String FirstName = input.nextLine();
	
	String LastName = input.nextLine();
	
	System.out.println("Before Swapping : " + FirstName + " " + LastName);

	String temp = FirstName;
	FirstName = LastName;
	LastName = temp;
	
	
	System.out.println("After Swapping : " + FirstName + " " + LastName);
	
	input.close();
}
}
