package day_28SuperConst;

public class Parent 
{
	String name;
	int no;
	
	public Parent ()
	{
		System.out.println("Parent Const");
	}
	
	public Parent(String name, int no)
	{
		this.name = name;
		this.no = no;
		System.out.println("Parent Overloaded Const " + name + " " + no);
	}

}
