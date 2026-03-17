package day_06_if_ifElse_ifElseLadder_NestedId_SwitchCase;

public class A021_MonthlyInternetBill 
{
	public static void main(String[] args) 
	{
		float internetUsage = 620.0f;
		float maintanance = 200.0f;
		float GST = 18/100f;
		float bill = 0.0f;
		
		if(internetUsage>100)
		{
			if(internetUsage>200)
			{
				if(internetUsage>300)
				{
					if(internetUsage>600)
					{
						bill = internetUsage*0.80f;
					}
					else
					{
						bill = internetUsage*1.0f;
					}
				}
				else
				{
					bill = internetUsage*1.5f;
				}
			}
			else
			{
				bill = internetUsage*2.0f;
			}
		}
		
		float totalBill = (bill * GST) + bill + maintanance;
		System.out.println("Your total bill = " + totalBill );
		
//		OR
		
		if(internetUsage > 600)
		{
		    bill = internetUsage * 0.80f;
		}
		else if(internetUsage > 300)
		{
		    bill = internetUsage * 1.0f;
		}
		else if(internetUsage > 200)
		{
		    bill = internetUsage * 1.5f;
		}
		else if(internetUsage > 100)
		{
		    bill = internetUsage * 2.0f;
		}
		else
		{
		    bill = internetUsage * 3.0f;
		}

		float FinalBill = bill + (bill * GST) + maintanance;

		System.out.println("Your total bill = " + FinalBill);
	}

}
