package day32_Hashmap;

//Q} COpy Array

import java.util.HashMap;
import java.util.Map;

public class Q_3 
{
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
//		Adding the values
		
		map.put(0070, "Shubham");
		map.put(0071, "Pawar");
		map.put(null, "Pawan");
		map.put(0250, "Ajay");
//		Print the Array
		
		System.out.println(map);
//		Size of an Array
		
		System.out.println(map.size());
		
//		Get Specific value mapped for the key
		System.out.println(map.get(0070));
		
//		Copy Array

		Map<Integer, String> map1 = new HashMap<Integer, String>();
		
		map1.putAll(map);
		
		map1.put(0050, "Aakash");
		
		System.out.println(map1);
	}

}
