package day_05_If_IfElse_TernaryOperators;

public class A002_TernaryOperator 
{
	public static void main(String[] args) {
		int a = 15;
		int b = 25;
		
		String result = (a>b)? "A greater than b" : "A less than B";
		System.out.println(result);
		
//		OR we can directly print
		
		System.out.println(a>b?"A Greater than B": "B Greater than A" );
		
	}

}
