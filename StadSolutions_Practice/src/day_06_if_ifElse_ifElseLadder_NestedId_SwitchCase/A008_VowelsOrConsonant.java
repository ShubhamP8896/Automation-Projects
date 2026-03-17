package day_06_if_ifElse_ifElseLadder_NestedId_SwitchCase;

public class A008_VowelsOrConsonant 
{
	public static void main(String[] args) {
		char ch = 's';
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' 
		|| ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
		{
			System.out.println(ch + " is Vowels");
		}
		else
		{
			System.out.println(ch + " is Consonant");
		}
		
		switch(ch) {
		case 'a': case 'e' : case 'i' : case 'o' : case 'u' :
		case 'A': case 'E' : case 'I' : case 'O' : case 'U' :
			System.out.println(ch + " is Vovels");
			break;
			default :
				System.out.println(ch + " is Consonant");
		}
		
		
		
	}

}
