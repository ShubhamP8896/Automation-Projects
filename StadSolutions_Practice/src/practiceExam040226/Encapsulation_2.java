package practiceExam040226;

public class Encapsulation_2 
{
	public static void main(String[] args) 
	{	
		Encapsulation_1 en = new Encapsulation_1();
		
		System.out.println(en.getAge());
		System.out.println(en.getSalary());
		
		en.setage(30);
		en.setSalary(15.00f);
		
		System.out.println("Update Age: "+en.getAge());
		System.out.println("Updated Salary "+en.getSalary());
		
		String name = en.name;
		System.out.println(name);
		
		
	}

}
