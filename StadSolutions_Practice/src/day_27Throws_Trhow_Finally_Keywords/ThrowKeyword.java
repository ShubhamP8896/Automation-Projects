	package day_27Throws_Trhow_Finally_Keywords;

public class ThrowKeyword 
{
	
	public static void main(String[] args) 
	{
		String data = null;
		
		if (data == null)
		{
			try {
				throw new Exception("Data Not Found");   // here we generate our exception
				
				
//				System.out.println("HELLO");    this is unreachable code if we write any code below the throw exception that showing an compile error
				
				}
//				Here if your data is reading from some excel file and over there the value is null so I am handling the 
//				exception in my own way with exception as “DatanotfoundException” it is not the exception given by java.
				
			catch (Exception e) 
			{
				System.out.println("Data exception is coming .....");        // this is execute
				System.out.println(e);       // here showing our generated exception when exception is occurred
				e.printStackTrace();        // here showing our msg with line number where exception is occurred
				System.out.println(e.getMessage());   // here showing oue msg which we added.
			}
		}
		
		System.out.println("End of program");
	}

}
