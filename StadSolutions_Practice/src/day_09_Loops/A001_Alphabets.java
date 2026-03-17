package day_09_Loops;

public class A001_Alphabets
{
	public static void main(String[] args) 
	{
		char a = 'a';
		System.out.println("for Loop");
		for (; a<='z';a++)
		{
			System.out.println(a);
		}
		System.out.println("while Loop");
		char b = 'A';
		while(b<='Z')
		{
			System.out.println(b);
			b++;
		}
		System.out.println("fo while Loop");
		char c = 'a';
		do {
			System.out.println(c);
			c++;			
		}while(c<='z');
		
		
	}

}
