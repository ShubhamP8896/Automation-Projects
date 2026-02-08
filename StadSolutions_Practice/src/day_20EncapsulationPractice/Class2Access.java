package day_20EncapsulationPractice;

public class Class2Access 
{
	public static void main(String[] args) 
	{
		Class1_Hide Obj = new Class1_Hide();
		Obj.browserLaunch("Chrome");         // all the private methods also called using this
	}


}
