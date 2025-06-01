package AutomationTesting6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class JavaCollection1
{
	public static void main(String[] args)                    // Session - 47 (01-04)
	{
		
		
//		We are able to add multiple data for sinlge variable (A)
//		Also we are able to add multiple Multiple data types for that one variable
		
		ArrayList A = new ArrayList();
		
		A.add(10);
		A.add(20);
		A.add('S');
		A.add("Pawar");
		A.add(10.50);
		
	System.out.println(A);
	
//	If we want to use only Specific type of data then we need add data type in "< >" in this bracket.
	
//	Example 1 ; If we want to use Integer datatype only.
		ArrayList <Integer> B = new ArrayList <Integer>();
		B.add(10);        // Index-0
		B.add(20);        // Index-1	
		B.add(30);        // Index-2
		B.add(40);        // Index-3
		System.out.println(B);              
		
		
//	Example 2 ; If we want to use String datatype.
		ArrayList <String> C = new ArrayList <String>();
		C.add("Shubham");
		C.add("Pawar");
		System.out.println(C);
		
//		--------------------------------------------------
//		If You want to type any specific value then we need to use get method with variable and pass index
			ArrayList <Integer> D = new ArrayList <Integer>();
			D.add(10);        // Index-0
			D.add(20);        // Index-1	
			D.add(30);        // Index-2
			D.add(40);        // Index-3
			D.add(50);		  // Index-4
//			System.out.println(B);              // Type All the Values
			
//			If we want to print only specific value from all we need to use "get()" method with variable
			
			System.out.println(B.get(0));
			System.out.println(B.get(2));
			
//			If we want to replace any value of any of the Index number.------------------
//			We need to use "set()" method and need to pass index number and value.
			
			D.set(0 , 15);
			D.set(1 , 25);
			D.set(2 , 35);
			D.set(3 , 45);
			D.set(4 , 55);
			
			System.out.println(D);
			
//			If we want to remove any of the value of the index number:----------------
//			We need to use "remove()" method and pass index number.
			
			D.remove(1);
			D.remove(3);
			
			System.out.println(D);
			
//			Also we are able to use for loop in this for pront all values
			
			for (int i = 0; i<= 2; i++)
			{
				System.out.println(D.get(i));
			}
			
//			Also we are able to all other types same like array list
			
				
			LinkedList <Integer> G = new LinkedList <Integer>();
			G.add(100);        // Index-0
			G.add(200);        // Index-1	
			G.add(300);        // Index-2
			G.add(400);        // Index-3
			G.add(500);		  // Index-4
			
			System.out.println(G);
			
			
			Vector <Integer> E = new Vector <Integer>();
			E.add(110);        // Index-0
			E.add(220);        // Index-1	
			E.add(330);        // Index-2
			E.add(440);        // Index-3
			E.add(550);		  // Index-4
			
			System.out.println(E);
			
			Stack <Integer> F = new Stack <Integer>();
			F.add(10);        // Index-0
			F.add(20);        // Index-1	
			F.add(30);        // Index-2
			F.add(40);        // Index-3
			F.add(50);		  // Index-4
			
			System.out.println(F);
			
			
			
//			Upcasting : We are converting List Interface Into Class----------------------
			
			
			List H = new ArrayList();
			H.add("Shubham");
			H.add("Pawar");
			H.add(555);
			H.add('S');
			
			System.out.println(H);        // For add all the values from different data types
			
//			For Specific Data type need to pass data type in "< >".
			
			List <String> I =  new ArrayList<String>();
			
			I.add("Shubz008");
			System.out.println(I);
			
			
//			Also Like add, get, replace and set methods we able to use with this "List" after conversion
			
//			With LinkedList
			
			List J = new LinkedList();
			J.add("Shubham");
			J.add("Pawar");
			J.add(555);
			J.add('S');
			System.out.println(J);
			
//			With Vector
			List K = new Vector();
			K.add("Shubham");
			K.add("Pawar");
			K.add(555);
			K.add('S');
			System.out.println(J);
			
//			With Stack		
			List L = new Stack();
			L.add("Shubham");
			L.add("Pawar");
			L.add(555);
			L.add('S');
			System.out.println(J);
			
			
			
			
			

			
			
			
//			
			
			
			
			
			
		

		
		
		
		
		
		
				
	
	
	}

}
