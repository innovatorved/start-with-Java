class A{
    public void method1(){
        System.out.println("This is the method of class A");
    }
}

class B extends A{
    public void method2(){
        System.out.println("This is method of Class B");
    }

    // we overrride class A method1
    @Override
    public void method1(){
        System.out.println("This is metheod of Class B oveerride to Class A");
    }

}
public class j44MetheodOverride{
    public static void main(String[] args){
        
        B b = new B();
        b.method1();
    }
}