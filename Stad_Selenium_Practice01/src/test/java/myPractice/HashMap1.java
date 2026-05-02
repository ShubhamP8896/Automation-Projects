package myPractice;

import java.util.HashMap;

public class HashMap1 
{
	public static void main(String[] args) {
		
		HashMap<Integer , String> hmap = new HashMap<Integer, String>();
		
		hmap.put(101, "Shubham");
		hmap.put(102, "SP"); // print this
		hmap.put(101, "Shubz");  // print this
		hmap.put(103, "Shubz"); // print this
		hmap.put(104, "Shubham"); // print this
		hmap.put(105, "Shubham"); // print this
		hmap.put(106, null); // print this
		hmap.put(null, "Shubham");
		hmap.put(null	, null); // print this

		
		System.out.println(hmap);
		System.out.println(hmap.get(101));
		System.out.println(hmap.size());
		
		for(String mp : hmap.values())
		{
			System.out.println(mp);
		}
		
		for(Integer mp : hmap.keySet())
		{
			System.out.println(mp);
		}
		
	}

}
