package java_coading_programs_Strings;

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
        
        System.out.println("------------------------------");
///		Also we are able to use this simple version using isDuplicate flag
///		Also this we are able to use same code for the Arrays as well
///        
        String str = "Shubham";
        
        for(int i = 0; i < str.length(); i++)
        {
            boolean isDuplicate = false;
            int count = 1;
            for(int j = 0; j < i ; j++)
            {
                if(str.charAt(i) == str.charAt(j))
                {
                	count++;
                    isDuplicate = true;
                    break;
                }
            }
            if(isDuplicate)
            {
            System.out.println(str.charAt(i) + " " + count);
            }
        }
		
	}

}
