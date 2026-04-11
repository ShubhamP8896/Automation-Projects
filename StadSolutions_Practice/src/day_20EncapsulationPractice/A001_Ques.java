package day_20EncapsulationPractice;

public class A001_Ques
{
	private String name;
	private int age;
	private String country;

	A001_Ques(String name, int age, String country)
	{
		this.name = name;
		this.age = age;
		this.country = country;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getCountry()
	{
		return country;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setName(String name)
	{
		this.name=name;		
	}
	
	public void setCountry(String country)
	{
		this.country=country;		
	}
	
	public void setAge(int age)
	{
		this.age=age;		
	}	
}
