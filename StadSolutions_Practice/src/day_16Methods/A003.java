package day_16Methods;

public class A003 {

	public int sum(int a, int b, int c)
	{
		return a+b+c;
	}
	
	public static void main(String[] args) {
		A003 obj = new A003();
		
		int total = obj.sum(5, 5, 5);
		float avg = total/3;
		
		System.out.println("total : "+ total);
		System.out.println("avg : " + avg);
	}
	
}
