package java_coading_programs_Strings;

public class P014_MoveSymbolsAtStart_Or_End 
{
	public static void main(String[] args) 
	{	
		String s = "#shu#b#ham";
		StringBuilder str = new StringBuilder();
		StringBuilder hash = new StringBuilder();
		
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == '#')
			{
				hash.append(s.charAt(i));
			}
			else
			{
				str.append(s.charAt(i));
			}
		}
		
//		If symbol want at start
		System.out.println(hash.append(str));
		
//		If symbol want at the end
		System.out.println(str.append(hash));
		
		
	}

}
