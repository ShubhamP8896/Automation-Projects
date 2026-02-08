package day29_Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Q_11 {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	
	System.out.println("Give me String");
	String Str = input.nextLine();
	
	String [] wordCount = Str.split(" ");
	System.out.println(wordCount.length);
	
	System.out.println(Arrays.toString(wordCount));
	
	input.close();
}
}
