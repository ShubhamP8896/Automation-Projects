package FaceBook1;

public class PracticeExp 
{
	public static void main(String[] args) {
		
	 int a= 5;
	 int b = a++;   //   POSTFIX Assign First then Increment 
	 
	 System.out.println("A : " + a);  //6
	 System.out.println("B : " + b);  //5
	 
	 int x= 5;
	 int y = ++x;   // PREFIX  Increment first then assign
	 
	 System.out.println("X : " + x);  //6
	 System.out.println("Y : " + y);  //6
	 
	 int p= 5;
	 int q = p--;   // POSTFIX Assign First then decrement 
	 
	 System.out.println("P : " + p);  //4
	 System.out.println("Q : " + q);  //5
	 
	 int s= 5;
	 int t = --s;   //  PREFIX decrement first then assign
	 
	 System.out.println("S : " + s);  //4
	 System.out.println("T : " + t);  //4

	 
	 int u = 5;
	 System.out.println(u++);  //5       //   POSTFIX Assign First then Increment 
	 System.out.println(u);   //6
	
	 int d = 5;
	 System.out.println(++d);  //6       //  PREFIX Increment first then assign
	 System.out.println(d);    //6
	 
	 int e = 5;
	 System.out.println(e--);   //5        //   POSTFIX Assign First then decrement 
	 System.out.println(e);   //4
	 
	 int f = 5;
	 System.out.println(--f);   //4         //  PREFIX decrement first then assign
	 System.out.println(f);     //4
		
	}
	
}
