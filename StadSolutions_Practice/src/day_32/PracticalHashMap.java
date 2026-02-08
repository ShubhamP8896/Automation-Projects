package day_32;

import java.util.HashMap;

//Mapped the User Credentials as per the Role

public class PracticalHashMap 
{
	public static String getCreds(String role)
	{
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Admin","Admin@test.com|Admin@123");
		map.put("Super User", "Superu@test.com|Super@123");
		map.put("Lead User", "Leadu@test.com|Lead@123");
		map.put("Support", "Support@test.com|Support@123");
		
		return map.get(role); // it will return the credentials
	}
	
//	Now it will print credentials as it is, but if we want to print Username and password separately then use split method, so need to add one more method
	
//	for Get User name
	
	public static String getUsername(String role)
	{
		String cred = getCreds(role); 
		return cred.split("\\|")[0];              // We passed index here       
	}
	
//	For get password
	
	public static String getPassword(String role)
	{
		String cred = getCreds(role); 
		return cred.split("\\|")[1];              // We passed index here       
	}
	
	public static void main(String[] args) {
//		this is static method so we called directly in static method, but better to call with class name
		String cred = getCreds("Admin");     // called static method and passed role in the argument
		System.out.println(cred);
		
		System.out.println(PracticalHashMap.getUsername("Admin"));
		
		System.out.println(PracticalHashMap.getPassword("Admin"));
		
	}

}
