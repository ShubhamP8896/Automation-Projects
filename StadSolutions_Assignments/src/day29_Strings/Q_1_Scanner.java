package day29_Strings;

import java.util.Scanner;

public class Q_1_Scanner {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);    // for input 1
	
//	Write input
	
	System.out.println("Please give me First Name : ");
	String First_Name = input.nextLine();
	
	System.out.println("Please give me Last Name : ");
	String Last_Name = input.nextLine();
	
	String Full_Name = First_Name + " " + Last_Name;     // Concatenation
	
	System.out.println(Full_Name);
	
	input.close();
	
	
	
}
}
