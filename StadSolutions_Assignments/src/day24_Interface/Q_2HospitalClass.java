package day24_Interface;

public class Q_2HospitalClass implements Q_2usmeHosp, Q_2ukmeHosp, Q_2indHosp
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
	
//	Object to call all the methods
	public static void main(String[] args)
	{
		Q_2HospitalClass obj = new Q_2HospitalClass();
		
//		call all the methods using object ref variable
		
		System.out.println(obj.name);   // main child class hospital veriable
	
		obj.ENTServices();              // this is child class method
		obj.dentalServices();			// this is Indian interface method
		obj.orthoServeces();			// this is Indian interface method
		obj.PhysioServerces();			// this is UK interface method
		obj.pediaServices();			// this is UK interface method
		obj.cardioServices();			// this is US interface method
		obj.neuroservices();			// this is US interface method
		
		// to call the Data members or Variables we need to use that interface name
		
		System.out.println(Q_2usmeHosp.name);      // US Hospital name
		System.out.println(Q_2ukmeHosp.name);      // UK Hospital name
		System.out.println(Q_2indHosp.name);      // India Hospital name
		
		
		
		
		
		
	}
	

}
