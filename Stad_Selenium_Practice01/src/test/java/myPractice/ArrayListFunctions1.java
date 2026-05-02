package myPractice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListFunctions1 
{
	public static void main(String[] args)
	{
//		Raw array : Able to add all the different data types
		System.out.println("Raw Array");
		ArrayList ar = new ArrayList(); 
		
		ArrayList<Object> arObj = new ArrayList<>(); 
		arObj.add("Shubham Pawar");
		arObj.add(881996);
		arObj.add(9.56);
		arObj.add("Nanded");
		arObj.add('B');
		System.out.println(arObj);
		
		for(int i = 0; i < arObj.size(); i++)
		{
			System.out.print(arObj.get(i) + " ");
		}
		System.out.println();
		for(Object ls : arObj)
		{
			System.out.print(ls + " ");
		}
		System.out.println();
		
		arObj.add(4, "Nanded, Maharashtra, India");
		System.out.print(arObj + " ");
		
		System.out.println();
		
		arObj.remove(3);
		
		System.out.println(arObj);
	
		
		Collections.reverse(arObj);
		System.out.println(arObj);
		Collections.replaceAll(arObj, 9.56, 10.50);
		System.out.println(arObj);
		
		System.out.println("String Array");
		ArrayList<String> arStr = new ArrayList<>(); 
		arStr.add("Shubham");
		arStr.add("Pawar");
		int size = arStr.size();
		System.out.println(size);
		System.out.println(arStr);
		
		ArrayList<String> arStrCopy = new ArrayList<>(); 
		arStrCopy.addAll(arStr);
		System.out.println(arStrCopy);
		
		System.out.println("Int Array");
		ArrayList<Integer> arInt = new ArrayList<>(); 
		arInt.add(1);
		arInt.add(5);
		arInt.add(78);
		
		for(int lst : arInt)
		{
			System.out.println(lst);
		}
		
		System.out.println("Float Array");
		ArrayList<Float> arFloat = new ArrayList<>(); 
		
		System.out.println("Double Array");
		ArrayList<Double> arDouble = new ArrayList<>(); 
		
		System.out.println("Char Array");
		ArrayList<Character> arChar = new ArrayList<>(); 
		
		
	}

}
