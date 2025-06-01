package velocitypackage1;

import java.util.Arrays;
import java.util.Collections;

public class EighthArrayPrograms 
{
	
	public static void main(String[] args) 
	{
		// insted a=10 b=20 c=30 we using a=10 20 30 40...
		
//		int a[] = {10,20,30,40,50};
//		{
//			System.out.println(a[0]);
//			System.out.println(a[1]);
//			System.out.println(a[2]);
//			System.out.println(a[3]);
//			System.out.println(a[4]);
//		}
		
//		With For Loop :-------------------------------------------
//		int a[] = {10,20,30,40,50};
//		for (int i = 0; i<=4; i++)
//		{
//			System.out.println(a[i]);
//		}
		
//		With For Loop :-------------------------------------------
//		int a[] = {10,20,30,40,50};
//		for (int i = 0; i<=4; i++)
//		{
//			System.out.println("Values at index - "+i+ " is - " +a[i]);
//		}
//		For Reverse Array
//		for (int i = 4; i>=0; i--)
//			{
//				System.out.println("Values at index - "+i+ " is - " +a[i]);
//			}
		
		
//		For Length :------------------------------------
//		int a[] = {10,20,30,40,50};
//		{
//			System.out.println("Total Lenght is - "+a.length);
//			System.out.println();
//		}
//		for (int i = 0; i<=4; i++)
//			{
//				System.out.println("Values at index - "+i+ " is - " +a[i]);
//			}
//		Double for decimals :-----------------------------------
//		double b [] = {10.10, 20.20, 30.30, 40.40, 50.50};
//		{
//			System.out.println(b[0]);
//		}
		
//		With String datatype :-----------------------------------------
		
//		String c [] = {"shubham ", "balaji ", "pawar"};
//		for (int i = 0; i<=2; i++)
//		{
//			System.out.print(c[i]);
//		}

//		Array Syntax -2 :-------------------------------------------
	
//		int c [] = { 10,20,30,40,50};      //values are known/defined (Syntax 1)
		
//		If values are not defined/given then we used syntax 2
		
//		int a [] = new int [5];            // Values are not know. length = 5;
//		
//		a[0] = 10;                      // index - 0 
//		a[1] = 20;                      // index - 1 
//		a[2] = 30;                      // index - 2 
//		a[3] = 40;                      // index - 3 
//		a[4] = 50;                      // index - 4 
		
//		for (int i=0; i<a.length; i++)                         // we know lenthg (size)
//		{
//			System.out.println(a[i]);
//		}
//		
////		For Reverse values/arrays printing:---------------------
//		for (int i=a.length-1; i>=0; i-- )                         // we know lenthg (size)
//		{
//			System.out.println(a[i]);
//		}
//		
//	    for print element at even position:----------------------------------0 2 4 
		
//		int a [] = new int [5];            // Values are not know. length = 5;
//		
//		a[0] = 10;                      // index - 0 
//		a[1] = 20;                      // index - 1 
//		a[2] = 30;                      // index - 2 
//		a[3] = 40;                      // index - 3 
//		a[4] = 50;                      // index - 4 
//		
//		for (int i = 0 ; i < a.length ; i=i+2 ) //for odd index only put i=1 instead i=0
//		{
//			System.out.println(a[i]);           // index 0, 2, 4 even
//		}
		
//		
//		int a [] = {1,2,3,4,5,6,7,8,9,10};
//		int lengthofArray = a.length;
		
//		System.out.println("length:- "+lengthofArray);
//		
//		for (int i=0;i<lengthofArray;i++)
//		{
//			System.out.println(a[i]);
//		}
//		Print odd and Even Numbers from above Number with if else condition:--------------------
		
//		int a [] = {1,2,3,4,5,6,7,8,9,10};
//		int lengthofArray = a.length;
//		
//		System.out.println("length:- "+lengthofArray);
//		
//		for (int i=0;i<lengthofArray;i++)
//		{
//			if (a[i]%2==0)
//			{
//				System.out.println("This is Even Number:- " +a[i]);
//			}
//			else                        // if we remove this condition we get only even numbers
//			{
//				System.out.println("This is odd Number:- "+a[i]);  
//			} 
//		}
//		How to find maximum Number :---------------------------------------------------
		
//		int a [] = {1, 2, 3, 4, 5};
////		  Index =>  0  1  2  3  4
//		int x = a.length;
//			
////		Assume a[0] = 1 is maximum number 
//		int max = a[0];                       // assume max number
//		for (int i=0; i<x; i++)
//		{
//			if (a[i]>max)             // if our assumed a[0] is bigger than a[i] then 
//			{
//				max = a[i];           // we consider/ making a[i] as max number
//			}                        // this cycle will run upto we found max number.
//		}
//		System.out.println(max);
		
		
//		int a [] = {5, 3, 1, 4, 2};
////		  Index =>  0  1  2  3  4
//		int x = a.length;
//			
////		Assume a[0] = 1 is maximum number 
//		int max = a[0];                       // assume max number
//		for (int i=0; i<x; i++)
//		{
//			if (a[i]>max)             // if our assumed a[0] is bigger than a[i] then 
//			{
//				max = a[i];           // we consider/ making a[i] as max number
//			}                        // this cycle will run upto we found max number.
//		}
//		System.out.println("Max Number is:- "+max);	

//		We are able to use any nubmer as maximum number for assumption
		
//		int a [] = {5, 3, 1, 4, 2};
////		  Index =>  0  1  2  3  4
//		int x = a.length;
//			
////		We assume any number 1-100 as max number check with any number 
//		int max = 100;                       // assume max number
//		
//		for (int i=0; i<x; i++)
//		{
//			if (a[i]>max)             // if our assumed a[0] is bigger than a[i] then 
//			{
//				max = a[i];           // we consider/ making a[i] as max number
//			}                        // this cycle will run upto we found max number.
//		}
//		System.out.println("Max Number is:- " +max);

// How to Find Smallest Number :------------------------------------------------		
//		int a[] = {1,5,8,4,6};
//		int x= a.length;
//		int min = a[0];
//		for (int i = 0; i<x; i++)
//		{
//			if (a[i]<min)
//			{
//				min = a[i];
//			}
//		}
//		System.out.println("Smallest Number is:- "+min);
		
//	Q8] 	Copy From one array to Another Array :------------------------------------------
//		int a [] = {10, 20, 30, 40, 50};
//		int b [] = new int [5];
//		int x = a.length;
//		
//		b[0]=a[0];
//		b[1]=a[1];
//		b[2]=a[2];
//		b[3]=a[3];
//		b[4]=a[4];
//		
//		for (int i = 0; i<x ; i++)
//		{
//			System.out.println(b[i]);
//		}
	
//		Numbers In Ascending Order:------------------------------------------
//		int a [] = {0,5,8,6,2,4,1,9};
//		int x = a.length;
//		Arrays.sort(a);
//		System.out.println("Numbers In Ascending Order");
//		
//		for (int i = 0 ; i < x ; i++)
//		{
//			System.out.println(a[i]);
//		}
		
//		Elements In Descending Order :---------------------------------------------------
//		int a [] = {0,5,8,6,2,4,1,9};
//		int x = a.length;
//		int z = 0;
//		for (int i = 0 ; i < x ; i++)
//		{
//			for (int j = i+1; j<x; j++)
//			{
//				if(a[i] < a[j])
//				{
//					z = a[i];
//					a[i] = a[j];
//					a[j] = z;
//				}
//			}
//		}
//			
//		System.out.println("Elements of Array Sorting in Descendig Order:- ");
//		
//		for (int i = 0; i < x; i++)
//		{
//			System.out.println(a[i] + " ");
//		}
//		
		
		
		
		
	}
	
}