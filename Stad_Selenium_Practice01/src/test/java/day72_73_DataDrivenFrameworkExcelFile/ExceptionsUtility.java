package day72_73_DataDrivenFrameworkExcelFile;

public class ExceptionsUtility extends RuntimeException
{
	/**
	 * This class used for generating our own Exception message and showing to users
	 * @param msg  : We pass the message in the string.
	 */
	
	public ExceptionsUtility (String msg)
	{
		super(msg);
	}
}
