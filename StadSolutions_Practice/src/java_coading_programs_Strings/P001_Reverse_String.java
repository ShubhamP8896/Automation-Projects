package java_coading_programs_Strings;

public class P001_Reverse_String 
{
	public static void main(String[] args) 
	{
		
		String st = "Shubham Pawar";
		String rev = "";
		
		for(int i = st.length()-1; i >=0 ; i--)
		{
			rev = rev + st.charAt(i);
		}
		
		System.out.println("Og String: " + st);
		System.out.println("Reverse String: " + rev);
		
		
//		This also we are able to use directly
//		StringBuilder str = new StringBuilder(st);
//		str.reverse();
		
		
		
	}
		
}
