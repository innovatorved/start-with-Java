abstract class Base4{
    public Base4(){
        System.out.println("Base 4 constructor");
    }
    public void sayHello(){
        System.out.println("Hello boy");
    }
    // abstract metheod
    abstract public void welcome();
}

class Derived4 extends Base4{
    @Override
    public void welcome(){
        System.out.println("Abstract metheod of welxcome class Base4");
    }
    public void Derived4_meth1(){
        System.out.println("this is Derived4_meth1");
    }
}
public class j46AbstractClass{

    public static void main(String[] args){
        // we canot use abstract class directly into a program
        // abstract class are used as reference for other classes
        // Base4 = b = new Base4;  // not use bc this is abstract class
        Derived4 d = new Derived4();
        Base4 bb = new Derived4();
        d.welcome();
        d.Derived4_meth1();
        bb.sayHello();
        
    }
}