package day_33;

import java.util.HashSet;
import java.util.Set;

public class HashSet_Methods 
{
	public static void main(String[] args) {
		
		Set<Integer> numbers = new HashSet<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);
		
//		remove method
		numbers.remove(1);
		System.out.println(numbers); 
		
//		removeAll() method
		Set<Integer> EvenNumbers = new HashSet<Integer>();
		EvenNumbers.add(2);
		EvenNumbers.add(4);
		EvenNumbers.add(6);
		EvenNumbers.add(8);
		EvenNumbers.add(10);
		
		numbers.removeAll(EvenNumbers);
		System.out.println(numbers);
		
//		Clear()
  		numbers.clear();
		System.out.println(numbers);
	}

}
