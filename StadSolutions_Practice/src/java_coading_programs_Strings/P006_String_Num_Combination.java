package java_coading_programs_Strings;

public class P006_String_Num_Combination 
{
	public static void main(String[] args) {
		
		String s = "shu32bh32am";
		
		 StringBuilder name = new StringBuilder();
	        int sum = 0;
		
		for(char ch: s.toCharArray())
		{
			if(Character.isDigit(ch))
			{
				sum += Character.getNumericValue(ch);
			}
			else
			{
				name.append(ch);
			}
		}
		
		System.out.println(name + " " + sum);
		
		
//		Also this is able to do, if don't want to use the functions
		
        String s1 = "shu32b3h5am";
        
        StringBuilder str = new StringBuilder();
        int sum1 = 0;
        
        for(int i = 0; i < s.length(); i++)
        {
            if(s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z')
            {
                str.append(s1.charAt(i));
            }
            else
            {
                sum1 = sum1 + (s1.charAt(i) - '0') ;
            }
        }
         
        System.out.println(str + " " + sum1);
		
	}

}
