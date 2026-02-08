package day_23SuperKeyword;

// We are able to use the super keyword with constructor also to call the immediate parents constructor using the child class object explicitly

class Parent {
    int value;
    String name;

    //Parent class constructor
    
    Parent(int value, String name) {
        this.value = value;
        this.name = name;
        System.out.println("Parent constructor called with value: " + value+ " "+name);   // parent class
    }
    

}

class Child extends Parent {
//    String name;
//    int value;

    //Child class constructor
    
    Child(int value, String name) {
        super(value, name);              // Explicitly calls the Parent's parameterized constructor
//        this.name = name;
//        System.out.println("Child constructor called with name: " + name);         // child class
//        Also we are able to call the child class parameter also with using the this keyword 
        
        }
    } 


public class SuperWithCOnstructor {
    public static void main(String[] args) {
        Child obj = new Child(10, "Shubham");
    }
}
