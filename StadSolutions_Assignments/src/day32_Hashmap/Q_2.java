package day32_Hashmap;

//Check the size of an Array


import java.util.HashMap;
import java.util.Map;

public class Q_2 
{
	@SuppressWarnings("unchecked")
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
		
		map1 = (Map<Integer, String>) map.clone();
		
		System.out.println(map1);
	}

}
