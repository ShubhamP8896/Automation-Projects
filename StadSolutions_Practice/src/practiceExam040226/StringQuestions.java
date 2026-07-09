package practiceExam040226;



public class StringQuestions 
{
	public static void main(String[] args) 
	{
		int a = 371;
		int b = a;
		int sum = 0 ;
		
		while(b>0)
		{
			int num = b%10;
			
			sum = sum + (num*num*num);
			
			b = b/10;
		}
		
		System.out.println(sum);
	}

}
