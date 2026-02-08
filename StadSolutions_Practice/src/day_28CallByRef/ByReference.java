package day_28CallByRef;

//Check class 28 : 50:00

public class ByReference 
{
	String browser;
	String version;
	
	public void show()
	{
		System.out.println(browser + " " + version);
	}
	
	public ByReference(String browser, String version)    // constructor overloaded
	{
		this.browser = browser;
		this.version = version;
	}
	
	public void call(ByReference ref)        // ref is local variable  , so when we pass obj1 means ref is points towards Object ref on OBJ1
	{
		System.out.println("Call Method " + ref.browser + " " + ref.version);    
	}
	
	public ByReference()     // this is default constructor we used because I have to create the object and I used above overloaded constructor
	{						// if I didn;t create this then I need to pass the value in arg of object but I need two objects
		
	}
	
	public static void main(String[] args) {
		ByReference obj = new ByReference();
		ByReference obj1 = new ByReference("Chrome", "152"); 
		
		
		System.out.println(obj1.browser);          // here print the values which passed in the constructor argument
		System.out.println(obj1.version);
		
		System.out.println("----------------------------");
		
		obj.call(obj1);         // it will print the same values : Chrome and 152 because we passed overloaded const class obj as argument
		
		System.out.println("----------------------------");
		
		obj1.call(obj1);        // it will print the same values : Chrome and 152 because we passed overloaded const class obj as argument
		
		System.out.println("----------------------------");
		
		obj1.call(obj);        // here for obj is default so for this values are not assigned so it will print null 
		
		System.out.println("----------------------------");
		
		obj.browser = "Edge";
		obj.version = "50";
		
		obj1.call(obj);          // now we assigned the values so it will print those values
		
		System.out.println(obj.browser);
		System.out.println(obj.version);
		
		
	}
	

}
