package day_33;

import java.io.FileReader;
import java.io.IOException;

public class FileReadClass 
{
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\ADMIN\\eclipse-workspace\\StadSolutions_Practice\\test.txt");      // here we passed the Path  
		
		int ch;           
		
//		used while loop and added the condition if the index = -1 then that exit from loop, so it will print from index 0 to last index
		
		while ((ch=fr.read())!=-1)
		{
			 System.out.print((char)ch);                   // here in this we getting that ascii values so we used (char) in bracket so it will print the characters.
			 
		}
		
		fr.close();
		
	}

}
