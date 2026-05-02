package practiceExam040226;

public class Encapsulation_1
{
	private float salary = 9.56f;
	private int age = 25;
	String name = "Shubham Pawar";
	String location = "Nanded, Maharashtra, India";
	
	Encapsulation_1()
	{
		
	}
	
	Encapsulation_1(String name, String location)
	{
		this.name = name;
		this.location = location;
	}
	
	public float getSalary()
	{
		return salary;
	}

	public int getAge()
	{
		return age;
	}
	
	public void setSalary(float salary)
	{
		this.salary = salary;
	}
	
	
	public void setage(int age)
	{
		this.age = age;
	}
	
}
