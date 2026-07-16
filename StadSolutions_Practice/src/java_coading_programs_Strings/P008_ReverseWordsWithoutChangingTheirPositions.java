package java_coading_programs_Strings;

public class P008_ReverseWordsWithoutChangingTheirPositions 
{
	public static void main(String[] args) 
	{
		String str = "I Like Automation Testing";
		String s [] = str.split(" ");
		
		for(int i = 0; i < s.length; i++)
		{
			for(int j = s[i].length()-1; j >=0 ; j--)
			{
				System.out.print(s[i].charAt(j));
			}
			System.out.print(" ");
		}

//		OR
		
		for(int i = 0; i < s.length; i++)
		{
			System.out.print(new StringBuilder(s[i]).reverse() + " ");
		}
		
		
	}

}
