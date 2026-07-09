package java_coading_programs;

public class P004_Duplicate_CharOccurence
{
	public static void main(String[] args) {
		
		String st = "programming";
		String checked = "";
		
		for( int i = 0; i < st.length(); i++)
		{
			char ch = st.charAt(i);
			
			if(checked.indexOf(ch) == -1)
			{
				int count = 0;
				
				for(int j = 0; j <st.length(); j++)
				{
					if(ch == st.charAt(j))
					{
						count++;
					}
				}
				if(count > 1)
				{
					System.out.println(ch + " : " + count);
				}
				checked = checked + ch;
			}
		}
		
//		Also we are able to use this simple version
		
		System.out.println();
		
        String s = "Programming";
        String check = "";
        
        for(int i = 0; i < s.length(); i++)
        {
            if(check.indexOf(s.charAt(i)) != -1)
            {
                int count = 0;
                for(int j = 0 ; j < s.length(); j++)
                {
                    if(s.charAt(i) == s.charAt(j))
                    {
                        count++;
                    }
                }
                if(count > 1)
                {
                System.out.println(s.charAt(i) + " : " + count);
                }
            }
            
            check = check + s.charAt(i);
        }
		
	}

}
