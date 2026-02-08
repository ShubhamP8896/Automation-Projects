package day24_Interface;

public class Q_4HospitalClass implements Q_4usmeHosp, Q_4ukmeHosp, Q_4indHosp
{
	String name = "Main Hospital";
	
	public void ENTServices()
	{
		System.out.println("Main Hosp - Ent Services");
	}

	@Override
	public void dentalServices() 
	{
		System.out.println("Indian - Dental");
	}

	@Override
	public void orthoServeces() 
	{
		System.out.println("Indian - Ortho");
		
	}

	@Override
	public void PhysioServerces() 
	{
		System.out.println("UK Hospital - Physio");
	}

	@Override
	public void pediaServices() 
	{
		System.out.println("UK - Pedia");
	}

	@Override
	public void cardioServices() 
	{
		System.out.println("US Cardio");
	}

	@Override
	public void neuroservices()
	{
		System.out.println("US Neuro");
	}
	
// Grand Parent Interface
	@Override
	public void covidVaccine()
	{
		System.out.println("Grand Parent - WHO > Covid Vaccine");
		
	}
	
	public static void hospital()
	{
		System.out.println("Main Hospital - Static Method");
	}
	
	public void dm()
	{
		System.out.println("Hospital Child class");      // Override the Default method in the child class 
	}
	
	
//	Object to call all the methods
	public static void main(String[] args)
	{
		Q_4HospitalClass obj = new Q_4HospitalClass();
		
//		call all the methods using object ref variable
		
		System.out.println(obj.name);   // main child class hospital veriable
	
		obj.ENTServices();              // this is child class method
		obj.dentalServices();			// this is Indian interface method
		obj.orthoServeces();			// this is Indian interface method
		obj.PhysioServerces();			// this is UK interface method
		obj.pediaServices();			// this is UK interface method
		obj.cardioServices();			// this is US interface method
		obj.neuroservices();			// this is US interface method
		obj.covidVaccine();    			// Grand Parent Method
		
		// to call the Data members or Variables we need to use that interface name
		
		System.out.println(Q_2usmeHosp.name);      // US Hospital name
		System.out.println(Q_2ukmeHosp.name);      // UK Hospital name
		System.out.println(Q_2indHosp.name);      // India Hospital name
		System.out.println(obj.name);
		
		Q_3usmeHosp.hospital();       // we are calling the parent interface static method
		
		Q_4HospitalClass.hospital();        // parent interface static method is hiding
		
		obj.dm();    // Calling the default method from UK interface parent we are able to overload as well as override this
		
		
		
		
	}

	

}
