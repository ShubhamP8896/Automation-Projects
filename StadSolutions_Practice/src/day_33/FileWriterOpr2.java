package day_33;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterOpr2 
{
	public static void main(String[] args) throws IOException {
//		Now file already created and I want to add data in that file
		FileWriter fw1 = new FileWriter("C:\\Users\\ADMIN\\eclipse-workspace\\StadSolutions_Practice\\test.txt"); 
		
		fw1.write(" New Text write in the file with passing the path");
		fw1.close();
		
		System.out.println("P End");
		
		
		
		
		
	}

}
