package assignment_6_16_10_2025;

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
