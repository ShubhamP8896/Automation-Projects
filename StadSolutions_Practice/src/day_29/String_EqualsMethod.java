package day_29;

//why for strings used .equals not ==

public class String_EqualsMethod
{
	public static void main(String[] args) {
		String s = "hello";   // it will store in the SCP (Sting constant pool")
		
		String s1 = "hello";  // this is duplicate so in the SCP not create duplicate object for hello there 2 ref veriables s and s1
		
		System.out.println(s == s1);       // it is compare the memory location and give true becasue both string stored in SCP
		System.out.println(s.equals(s1));  // it is compare values and gives true
		
		String s2 = new String("Shubham");   // it creating 2 objects one in heap memmory and another in the SCP for SCP "Shubham" there is no any ref variable.
//		 for heap memmory "Shubham" the ref veriable is s2
		
//		Now we create this
		String s3 = "Shubham";  // this is alreay present in SCP so s3 points towards "shubham"
		
//		Now if we used s2 == s3 then showing false becasue the memory location is diff and for .equals showing true
		
		System.out.println(s2 == s3);  // false
		
		System.out.println(s2.equals(s3));   // true
		
	}

	
	

}
