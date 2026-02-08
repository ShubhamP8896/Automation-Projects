package day_25AbstractClass;

abstract class Grandparent 
{
	    abstract void methodA();
	    void commonMethod() 
	    {
	        System.out.println("Common method in Grandparent");
	    }
}

abstract class Parent extends Grandparent
{
	    abstract void methodB();
	    // Parent inherits methodA() and commonMethod()
	    // It can also provide a default implementation for methodA() or leave it abstract
}

abstract class Child extends Parent 
{
	    @Override
	   void methodA() 
	    {
	        System.out.println("Implemented methodA in Child - Grand parent");
	    }

	    @Override
	   void methodB()
	    {
	        System.out.println("Implemented methodB in Child - Parent");
	    }
	    // Child inherits all methods (abstract and concrete) from Parent and Grandparent
	    // and must provide implementations for all remaining abstract methods.
	    abstract void methodC();
}

public class AbstractClassInheritance extends Child
{
	    public static void main(String[] args) 
	    {
	    	AbstractClassInheritance obj = new AbstractClassInheritance();
	    	
	    	obj.commonMethod();
	    	obj.methodA();
	    	obj.methodB();
	    	obj.methodC();
		}

		@Override
		void methodC() {
			System.out.println("Child abstract class method");
			
		}
	   
	
}
	
