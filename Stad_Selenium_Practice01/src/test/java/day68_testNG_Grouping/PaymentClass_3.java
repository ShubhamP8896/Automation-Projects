package day68_testNG_Grouping;

import org.testng.annotations.Test;

public class PaymentClass_3 
{
	@Test(priority = 1, groups = {"sanity" , "regression" , "functional"})
	public void paymentByCC()
	{
		System.out.println("Payment by credit card is completed");
	}
	
	@Test(priority = 2, groups = {"sanity", "regression", "functional"})
	public void paymentByDC()
	{
		System.out.println("Payment by debit card is completed");
	}
	
	@Test(priority = 3, groups = {"sanity", "regression", "functional"})
	public void paymentByCash()
	{
		System.out.println("Payment by cash is completed");
	}

}
