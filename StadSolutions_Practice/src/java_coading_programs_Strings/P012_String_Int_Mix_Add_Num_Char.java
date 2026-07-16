package java_coading_programs_Strings;

public class P012_String_Int_Mix_Add_Num_Char 
{
	public static void main(String[] args) {
		String str = "3r2a4s1b";
		String ans = "";
		int n = 0;
		
		for(int i = 0 ; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if(Character.isDigit(ch))
			{
				n=Character.getNumericValue(ch);
			}
			else if(Character.isLetter(ch))
			{
				for(int j = 0; j < n; j++)
				{
					ans += ch;
				}
			}
		}
		System.out.println(ans);
		
	}

}
