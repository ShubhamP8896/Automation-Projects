package day_11_Arrays;

public class A002 {

	public static void main(String[] args) {
		
		int [ ] a = {10,20,50,60,15,25};
		
		int sum = 0;
		int avg = 0;
		
		for(int i : a)
		{
			sum=sum+i;
		}
		
		avg = sum/a.length;
		
		System.out.println(avg);
		
	}
}
