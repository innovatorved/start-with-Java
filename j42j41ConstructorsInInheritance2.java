class BaseClass{
    BaseClass(){
        // BaseClass constructor with No arguments
        System.out.println("\nBaseClass constructor with No arguments");
    }
    BaseClass(int x){
        // BaseClass constructor with arguments x
        System.out.printf("\n\nBaseClass constructor with arguments x : [%d]" , x);
    }
}

class DerivedClass1 extends BaseClass{
    DerivedClass1(){
        // DerivedClass1 constructor with No arguments
        System.out.println("\nDerivedClass1 constructor with No arguments");
    }
    DerivedClass1(int x , int y){
        // DerivedClass1 constructor with two arguments x , y
        super(x);
        System.out.printf("\n\nDerivedClass1 constructor with 2 arguments x : [%d] and y : [%d]" ,x , y);
    }
}

class DerivedClass2 extends DerivedClass1{
    DerivedClass2(){
        // DerivedClass2 constructor with No arguments
        System.out.println("\nDerivedClass2 constructor with No arguments");
    }
    DerivedClass2(int x , int y , int z){
        // DerivedClass2 constructor with three arguments
        super(x,y);
        System.out.printf("\n\nDerivedClass1 constructor with 2 arguments x : [%d] , y : [%d] and z : [%d]" ,x , y , z);
    }
}

public class j42j41ConstructorsInInheritance2 {
    public static void main(String[] args){
        // ----------------------------------------------------------------
        // DerivedClass2 DC2 = new DerivedClass2(); // with no arguments
        // base_class_constructor -> then Derived_class_Constructor

        DerivedClass2 DC2 = new DerivedClass2(1,2,3); 
        // we use super keyword for manage base class constructors

        
    }
}