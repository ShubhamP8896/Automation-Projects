package AutomationTesting6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class JavaCollection2 
{
	public static void main(String[] args)                  // Session - 47 (1/4)
	
	{
//		Set :---------------------'
//		For all type of data types
				
		HashSet H = new HashSet();
		H.add(10);
		H.add('S');
		H.add(20.50);
		H.add("Shubham");
		System.out.println(H);                    //For type all the values on consle.
		
//		For Specific Datatypes.
		
		HashSet <Integer> A = new HashSet<Integer>();
		A.add(100);
		A.add(200);
		System.out.println(A);
		
		
		HashSet <Double> B = new HashSet<Double>();
		B.add(1.500);
		B.add(2.500);
		System.out.println(A);
		
//		Upcasting : Set Interface converting into class
		
		Set C = new HashSet ();
		C.add(555);
		C.add("shubz");  
		System.out.println(C);              // we are able to add all types of data type
		
//		For Specific data type
		
		Set<String> D = new HashSet <String>();
		D.add("Pawar");
		D.add("shubz"); 
		System.out.println(D);

		
//		LinkedHashSet:----------------------------------------
		
		LinkedHashSet L = new LinkedHashSet();
		L.add(10);
		L.add('S');
		L.add(20.50);
		L.add("Shubham");
		System.out.println(L);                    //For type all the values on consle.
		
//		For Specific Datatypes.
		
		LinkedHashSet <Integer> X = new LinkedHashSet<Integer>();
		X.add(100);
		X.add(200);
		System.out.println(X);
		
		
//		Upcasting : Set Interface converting into class
		
		Set Y = new LinkedHashSet ();
		Y.add(555);
		Y.add("shubz");  
		System.out.println(C);              // we are able to add all types of data type
		
		
//		Tree Set (Class):------------------------------------------------------
		TreeSet T = new TreeSet();
				
		
//		SortedSet (Interface) converting into clss with the help og TreeSet class
		SortedSet S = new TreeSet();
		
		
	}

}
