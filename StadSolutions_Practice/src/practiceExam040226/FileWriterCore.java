package practiceExam040226;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterCore 
{
	// for now i have to create the file so I added the name of that file as well, but If file already created then use only path
	private static String path = "C:\\Users\\ADMIN\\OneDrive\\Desktop\\StadAutomation\\test.txt"; 
	public static void main(String[] args) throws IOException 
	{
		FileWriter fw = new FileWriter(path);
		fw.write("Hello Java");
		
		fw.close();
		
		FileReader fr = new FileReader("C:\\Users\\ADMIN\\OneDrive\\Desktop\\StadAutomation\\test.txt");
		int fileInput;
		
		while((fileInput=fr.read())!=(-1))
		{
			System.out.print((char)fileInput);
		}		
	}

}
