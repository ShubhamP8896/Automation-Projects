package day32_Hashmap;

//Q> Normal Hashmap Array woth key and value


import java.util.HashMap;

public class Q_1 
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
		Object map1 = map.clone();
		
		System.out.println(map1);
	}

}
