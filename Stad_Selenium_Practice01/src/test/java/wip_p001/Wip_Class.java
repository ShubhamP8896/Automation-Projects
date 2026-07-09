package wip_p001;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Wip_Class 
{
	public static void main(String[] args) 
	{
		String pune = "Pune is the second biggest city in Maharashtra. Pune is home for many Banking and IT firms. "
				+ "There are numerous startups in and around the city. Mumbai Pune expressway is one of the busiest stretches "
				+ "on the Konkan coast.";
		
		String mumbai = "Mumbai is the capital of Maharashtra. Mumbai is the financial capital of India. Mumbai is the biggest city in Maharashtra. "
				+ "Mumbai's climate is generally humid but Pune enjoys a pleasant climate through the year.";
		
		String puneArray [] = pune.split(" ");
		String mumbaiArray[] = mumbai.split(" ");
		
		Set<String> set = new HashSet<String>();
		
		for(int i = 0; i < puneArray.length; i++)
		{
			for(int j = 0; j<mumbaiArray.length; j++)
			{
				if(puneArray[i].equals(mumbaiArray[j]))
				{
					set.add(mumbaiArray[j]);
				}
			}
		}
		
		System.out.println(set);
		
	}
	
	
	

}
