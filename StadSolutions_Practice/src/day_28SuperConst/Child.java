package day_28SuperConst;

public class Child extends Parent
{

	public Child()
	{
		super();          // this keyword always in first line  ,, It will call the parent class const
		
		System.out.println("Child");
	}
	
	public Child(String name, int no)
	{
		
		super(name, no);          // this keyword always in first line  ,, It will call the parent class const
		
		System.out.println("Child Overloaded");
	}
	
	public static void main(String[] args)
	{
		Child O = new Child();         // when we create class object then it will call first Parent const then Child class const
		
		Child O1 = new Child("Shubham", 50);
	}

}
