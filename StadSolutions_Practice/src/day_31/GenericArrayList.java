package day_31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericArrayList {
	public static void main(String[] args) {
		
		
//		This is the Generic ArrayList with data types here we need use of classes of all the data types
	
	ArrayList<String> Str = new ArrayList<String>();    // Sting is a class
	Str.add("Shubham");
	Str.add("Pawar");
	System.out.println(Str);
	System.out.println(Str.size());
	System.out.println(Str.get(1));
	
	
//	for Loop
	for(int i = 0;  i< Str.size(); i++)
	{
		System.out.println(Str.get(i));
	}
	
//	For Each Loop
	for(String fl : Str)
	{
		System.out.println(fl);
	}
	
	
	
	ArrayList<Integer> Int = new ArrayList<Integer>();   // Integer is the class, we need to use this here always in the array
	Int.add(8896);
	Int.add(1996);
	System.out.println(Int);
	System.out.println(Int.size());
	System.out.println(Int.get(1));
	
//	for Loop
	for(int i = 0;  i< Int.size(); i++)
	{
		System.out.println(Int.get(i));
	}
	
//	For Each Loop
	for(Integer fl : Int)
	{
		System.out.println(fl);
	}
	
	ArrayList<Character> Char = new ArrayList<Character>();    // Character is also class 
	Char.add('s');
	Char.add('p');
	System.out.println(Char);
	System.out.println(Char.size());
	System.out.println(Char.get(1));
	
	ArrayList<Float> flt = new ArrayList<Float>();    // Float also class, so basically we need to use here all the data types in the capital firts word becsue they have classes
	flt.add(101.500f);
	flt.add(500.5558f);
	System.out.println(flt);
	System.out.println(flt.size());
	System.out.println(flt.get(1));
	
//	Top Casting   >> Here List is the interface and parent of the ArrayList class
	
	List AR = new ArrayList();           // it's raw array without the Data types
	
	List <String> GA = new ArrayList<String>();       // It's Generic array
	
	GA.add("Java");
	GA.add("PHP");
	GA.add("MySql");
	
	GA.set(2, "JavaScript");           // Replace the index 2 and add the New Value
	
	System.out.println(GA);
	
	System.out.println("-----------------------");
	
	//Now sNow suppose if you want to store the employee data at that time you want to add values like empno(int),empname(String),
//	Salary(double),isPermenent(Boolean),gender(char) then what we need to use in generics. The answer for that we need to use 
//	Object as generics in ArrayList see the below example.

	ArrayList<Object> obj = new ArrayList<Object>();
	obj.add(101);
	obj.add("Shubham Pawar");
	obj.add("shubham@testmail.com");
	obj.add(98652520);
	obj.add(true);
	
	System.out.println(obj);
	System.out.println(obj.size());
	
//	for Loop
	for(int i = 0;  i< obj.size(); i++)
	{
		System.out.println(obj.get(i));
	}
	
//	For Each Loop
	for(Object fl : obj)
	{
		System.out.println(fl);
	}
	
//	remove() method for remove the value from given index
	obj.remove(3);
	System.out.println(obj);
	
//	add() >> this method used for add values and also add values at given index
	obj.add(3, null);
	System.out.println(obj);
	
//	addAll () >> It is method used for add all the values of one array to another array
	obj.addAll(Str);
	System.out.println(obj);
	
//	it will print the array in the reverse direction
	
	Collections.reverse(obj);
	System.out.println(obj);
		
}
}
