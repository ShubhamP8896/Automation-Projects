package practiceExam040226;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice
{
	public static String getCred(String role)
	{
		Map<String, String> map = new HashMap<String, String>();
 		map.put("admin", "admin@test.com|Test@123");
 		map.put("Super User", "superUser@test.com|Test@321");
 		map.put("Lead", "Lead@test.com|Test@456");
 		map.put("Support", "support@test.com|Test@654");
 		
		return map.get(role);
	}
	
	public static String getUserName(String role)
	{
		String username = HashMapPractice.getCred(role);
		String [] uName = username.split("\\|");
	
		return uName[0];
	}
	
	public static void main(String[] args) 
	{
		String cred = HashMapPractice.getCred("admin");
		System.out.println(cred);
		
		System.out.println(HashMapPractice.getUserName("admin"));
		
	}

}
