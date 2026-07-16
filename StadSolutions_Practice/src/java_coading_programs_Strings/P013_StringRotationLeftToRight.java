package java_coading_programs_Strings;

public class P013_StringRotationLeftToRight
{
	public static void stringRotation(String str)
	{
		String temp = str;
		
		for(int i = 0; i < str.length(); i++)
		{
			temp = temp.charAt(temp.length() - 1) + temp.substring(0, temp.length() - 1);
			System.out.println(temp);
		}
	}
	
	public static void main(String args [])
	{
		P013_StringRotationLeftToRight.stringRotation("Shubham");
	}
	
/*
 * Out put is:-
 * 
mShubha
amShubh
hamShub
bhamShu
ubhamSh
hubhamS
Shubham
 */

}
