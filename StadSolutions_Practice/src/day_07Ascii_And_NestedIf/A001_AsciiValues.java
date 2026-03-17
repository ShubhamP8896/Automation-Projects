package day_07Ascii_And_NestedIf;

public class A001_AsciiValues 
{
	
	public static void main(String[] args)
	{
		char a = 'a';            //65-90  97-122  48-57
		int Ascii = (int)a;
		System.out.println((int) a);
		System.out.println(Ascii);
		
		if(Ascii>=65 && Ascii<=122)
		{
			if(Ascii<=90)
			{
				System.out.println("Capital Letter: "+ a);
			}
			else
			{
				System.out.println("Small Letter: " + a);
			}
		}
		else if(Ascii>=48 && Ascii<=57)
		{
			System.out.println("Integer: " + a);
		}
	}

}
