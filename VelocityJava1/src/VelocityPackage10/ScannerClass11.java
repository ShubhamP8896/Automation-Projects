package VelocityPackage10;                             //session 30

import java.util.Scanner;

public class ScannerClass11 
{
	public static void main(String[] args) 
	{
		Scanner x = new Scanner(System.in);    //we need pass system.in argument always
		System.out.println("Enter First Number");
		int a = x.nextInt();
		
		System.out.println("Enter Second Number");
		int b = x.nextInt();
		
		System.out.println("Enter Third Number");
		double c = x.nextDouble();
		
		System.out.println(a+b+c);
		
		
	}

}
