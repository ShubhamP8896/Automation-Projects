package java_coading_programs_Strings;

public class P015_CountChar_And_AddintoString 
{
	public static void main(String[] args) {
		String s = "aaabbbccdddd";
	    StringBuilder result = new StringBuilder();

	    int count = 1;

	    for (int i = 1; i <= s.length(); i++) 
	    {
	        if (i < s.length() && s.charAt(i) == s.charAt(i - 1)) 
	        {
	            count++;
	        } else
	        {
	            result.append(s.charAt(i - 1));
	            if (count > 1) {
	                result.append(count);
	            }
	            count = 1;
	        }
	    }

	    System.out.println(result);
	}
}
