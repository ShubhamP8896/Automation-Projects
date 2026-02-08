package day29_Strings;

import java.util.Scanner;

public class Q_7 {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	
	System.out.println("Give me String");
	String Name = input.nextLine();
	
	System.out.println(Name);
	
	Name = Name.replace('A', 'S');
	
	System.out.println("Charecter Replaced " + Name);
	
	input.close();
}
}
