package day_06_if_ifElse_ifElseLadder_NestedId_SwitchCase;

public class A007_CheckAlphabetOrNot
{
	public static void main(String[] args)
	{
		char ch = 'A';   //65-90  // 97-122 // 48-57
		int ascii = (int)ch;
		System.out.println(ascii);
		
		if(ascii>=48 && ascii<=57)
		{
			System.out.println(ch + " is number");
		}
		else if(ascii>=65 && ascii<=90)
		{
			System.out.println(ch + " is Capital letter");
		}
		else if(ascii>=97 && ascii<=122)
		{
			System.out.println(ch + " is Small letter");
		}
		else
		{
			System.out.println(ch + " is symbol");
		}
		
	}

}
