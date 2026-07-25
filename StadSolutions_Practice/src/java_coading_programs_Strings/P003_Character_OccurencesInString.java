package java_coading_programs_Strings;

public class P003_Character_OccurencesInString
{
	public static void main(String[] args) 
	{
		
		String st = "Programming";
		String checked = "";
		
		for(int i = 0 ; i < st.length(); i++)
		{
			char ch = st.charAt(i);
			
			if(checked.indexOf(ch) == -1)
			{
				int count = 0;
				
				for(int j = 0; j < st.length(); j++)
				{
					if(ch == st.charAt(j))
					{
						count ++;
					}
				}
				 System.out.println(ch + " : " + count);
	             checked = checked + ch;
			}
		}
		
		System.out.println();
		
//		Also we are able to use this simple version 
		
        String s = "Programming";
        String check = "";
        
        for(int i = 0; i < s.length(); i++)
        {
        	if(check.indexOf(s.charAt(i)) == -1)
        	{ 
        		int count = 0;
                for(int j = 0 ; j < s.length(); j++)
                {
                    if(s.charAt(i) == s.charAt(j))
                    {
                        count++;
                    }
                }
                System.out.println(s.charAt(i) + " : " + count);
        	}
                
        	check = check + s.charAt(i);
                
        }
            
        
    }
		
}

