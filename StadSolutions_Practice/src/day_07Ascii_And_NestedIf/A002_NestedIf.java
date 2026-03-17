package day_07Ascii_And_NestedIf;

public class A002_NestedIf 
{
	public static void main(String[] args) {
		
//		WAP if candidate age is above 18 and gender is male then able to apply else not
		int age = 61;
		String gender = "female";
		
		if(age>=18 && age <=60)
		{
			if(gender.equals("male"))
			{
				System.out.println("Candidate Able to apply for Openings, gender: " + gender);
			}
			else
			{
				System.out.println("Candidate is disqualified, because of gender: " + gender);
			}
		}
		else
		{
			System.out.println("Candidate is disqualified, because of age: " + age);
		}
		
		
		
		
	}

}
