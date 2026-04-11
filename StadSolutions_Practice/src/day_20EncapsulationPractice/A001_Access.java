package day_20EncapsulationPractice;

public class A001_Access
{
	public static void main(String[] args) {
		A001_Ques obj = new A001_Ques("Shubham Pawar", 28, "India");
		
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		System.out.println(obj.getCountry());
		
		obj.setName("SP");
		System.out.println(obj.getName());
		
		obj.setAge(30);
		System.out.println(obj.getAge());
		
		obj.setCountry("Ind");
		System.out.println(obj.getCountry());
	}

}
