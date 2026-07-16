package java_coading_programs_Strings;

public class P002_Remove_Duplicates_String 
{
	public static void main(String[] args) {
		String st = "automation testing";
		String result = "";
		
		for(int i = 0; i < st.length(); i++)
		{
			char ch = st.charAt(i);
			
			if(result.indexOf(ch) == -1)
			{
				result += ch;
			}
		}
		
//		If there are some letters are in the Capital then that String is first convert into lower case
		
		System.out.println("Original String: " + st);
		System.out.println("Duplocate Removed: " + result);
	}

}
