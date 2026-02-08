package day_28BuilderPatter_MethodChaining;

public class MethodChaining
{
//	we replaced void and added class name for using method chaining concept
	
	public MethodChaining login(String username, String Password)   // always use return type as class name
	{
		System.out.println("User name and password added successfully" + " Username: " + username + " Password : " + Password );
		return this;              // used this to call directly with single object using method chaining. It will call the class object
		
//		return new MethodChaining();  >> we are able to do this alos but is will create a new object in the memmor when we call this
//		and return this is used same object to call all the methods
		
	}
	public MethodChaining search(String productName)
	{
		System.out.println("Product name : "+ productName);
		return this;
	}
	public MethodChaining search(String productName, int PriceRange)
	{
		System.out.println("Product Name: " + productName + " Price : " + PriceRange);
		return this;
	}
	public MethodChaining addtoCart(int count, int price)
	{
		System.out.println("Number of products : "+ count + " Price : "+ price);
		return this;
	}
	public MethodChaining payment()
	{
		System.out.println("Payment completed Successfully");
		return this;
	}
	public MethodChaining logout()
	{
		System.out.println("User logout");
		return this;
	}
	
	public static void main(String[] args) 

	{
//		to call above all methods we are created an object and call all methods one by one with object reference like below
		MethodChaining obj = new MethodChaining();
		
		obj.login("test@test.com", "test@123456");    // we are able to use this also
		obj.search("Mobilew Phones - Samsung");
		
//		But instead of this we will call now all the methods using the method chaining concept or Builder pattern
		
// 		so for this we first add the return type as class name and and then use "return this".
		System.out.println("--------------------");
//		Now below is method chaining :
	
		obj.login("shubham@test.com", "123456").search("Mobile").search("Samsung", 50000).addtoCart(2, 100000).payment().logout();
		
		
		System.out.println("-----------------");
		
		MethodChaining obj1 = new MethodChaining();
		
		obj1.login("username" , "Pass")
			.search("Television")
				.addtoCart(1, 15000)
					.payment()
						.logout();		
	}
	
	
}
