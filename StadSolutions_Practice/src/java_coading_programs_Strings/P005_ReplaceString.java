package java_coading_programs_Strings;

public class P005_ReplaceString
{
	public static void main(String[] args) {
		
		String s = "Java is good but python is better";
		
		s = s.replace("good", "temp");
		s = s.replace("better", "good");
		s = s.replace("temp", "better");
		
		System.out.println(s);
		
		
	}

}
