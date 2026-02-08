package day32_Hashmap;

//Q} map contains the mapped value or not 

import java.util.HashMap;
import java.util.Map;

public class Q_4 
{
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
//		Adding the values
		
		map.put(0070, "Shubham");
		map.put(0071, "Pawar");
		map.put(null, "Pawan");
		map.put(0250, "Ajay");
//		Print the Array
		

// Value mapped or not for the KEY		
		System.out.println(map.containsKey(0070));    // true
		
		System.out.println(map.containsKey(01));   //false
		
		
// Key Mapped or not for the Value
		System.out.println(map.containsValue("Pawan"));    // true
		
		System.out.println(map.containsValue("Test"));   //false
		

	}

}
