package day_33;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteOpr1 
{
	public static void main(String[] args) throws IOException          // we need to throw the IO-Exception
	{
		// file writer
		
		FileWriter fw = new FileWriter("test.txt"); // we are able to create the any type of file just need to add here extension (.pdf, .docs, .doc or .txt)
		String str = "Hi I am Shubham and this is the Java code";
		fw.write(str);
		
//		If file already created and we want to add the data
//		FileWriter fw1 = new FileWriter("C:\\Users\\ADMIN\\eclipse-workspace\\StadSolutions_Practice\\test.txt"); 
		String str1 = "  >> Hi I am Shubham and this is the Java code";
		fw.write(str1);
		
		fw.write("  :: Shubham Pawar");
		
//		Also we are able to the for loop
		
		for (int i =0; i<str.length();i++)
		{
			fw.write(str.charAt(i));
		}
		fw.close();
		
		System.out.println("Program End");				
		
		
	}
}



