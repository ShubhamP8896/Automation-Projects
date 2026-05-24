package day_09_Loops;

public class A012_FebonacciSeries {
	public static void main(String[] args) {
		int first = 0, second = 1, fn = 0;
		 
//		 0,1,1,2,3,5,8
		 while(first<=15)
		 {
			 System.out.println(first);  // 
			 fn =  first+second;  // 
			 first = second; // 
			 second = fn;  // 
		 }
		
		
	}
}
