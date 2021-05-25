
class Base1{
    public int x , y;
    public Base1(){
        System.out.println("\nI am Constructor of Base1 Class");
    }
}
class Parent1 extends Base1{
    // it automatic call the BAse class constructor first
    // and if constructor is present on  this class it calls both

    public Parent1(){
        System.out.println("\nI am Parent Class Constructor");
    }
    //
}

public class j41ConstructorsInInheritance {
    
    public static void main(String[] args){

        // Constructors in Inheritance
        // Base1 base_Class = new Base1();
        Parent1 Parent_Class = new Parent1(); 
        //first call the constructor of base class then derived class
    }
    
}
