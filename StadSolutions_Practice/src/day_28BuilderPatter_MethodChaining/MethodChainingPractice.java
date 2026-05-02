package day_28BuilderPatter_MethodChaining;

public class MethodChainingPractice 
{
	public MethodChainingPractice login(String username, String pass)
	{
		System.out.println(username  + " " + pass);
		return this;
	}
	
	public MethodChainingPractice searchProduct(String productName)
	{
		System.out.println("Product Name: "+productName);
		return this;
	}
	
	public MethodChainingPractice addToCart(int qty)
	{
		System.out.println("Quantity: "+qty);
		return this;
	}
	
	public MethodChainingPractice Payment(String pMethod)
	{
		System.out.println("Payment Method: " +  pMethod);
		return this;
	}
	
	public static void main(String[] args) {
		MethodChainingPractice obj = new MethodChainingPractice();
		
		obj.login("Shubhamp@test.com", "123456")
			.searchProduct("Mobile Phones")
				.addToCart(1)
					.Payment("Online Netbanking");
		
		
		
	}

}
