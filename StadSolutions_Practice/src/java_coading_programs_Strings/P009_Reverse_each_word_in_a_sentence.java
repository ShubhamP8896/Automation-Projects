package java_coading_programs_Strings;

public class P009_Reverse_each_word_in_a_sentence 
{
	public static String revString(String value)
	{
		String rev = "";
		for(int i = value.length()-1; i >=0; i--)
		{
			rev = rev + value.charAt(i);
		}
		
		return rev;
	}
	
	public static void main(String[] args) 
	{
		String st = P009_Reverse_each_word_in_a_sentence.revString("Automation Testing");
		System.out.println(st);
	}

}
