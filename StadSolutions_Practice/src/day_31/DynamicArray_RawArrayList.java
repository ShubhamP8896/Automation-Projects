package day_31;

import java.util.ArrayList;

public class DynamicArray_RawArrayList {
	public static void main(String[] args) 
	{
		ArrayList ar = new ArrayList();        //ArrayList class object  
		
		ar.add(101); //0  // we used add method to add the elements
		ar.add("Shubham"); //1
		ar.add(5515.55); //2
		ar.add(true);   // 3
		
//		here for all showing warning becasue 

		System.out.println(ar);         // normal printng 
		
		System.out.println(ar.size());   // we used .size()  method of ArrayList class to find the size of array
		
		System.out.println(ar.get(1));    // it will print the value of that index, here we used get method
		
//		Using for loop
		
		System.out.println("-------------------------");
		
		for (int i = 0; i<ar.size();i++)            // we used size here inplace of length
		{
			System.out.println(ar.get(i));
		}

		System.out.println("-------------------------");
		
//		for each method
		for (Object a : ar)                   // use object here in place of data type
		{
			System.out.println(a);
		}
		
		
		
		
	}

}
