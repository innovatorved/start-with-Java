class AA{
    public void method1(){
        System.out.println("This is the method of class A");
    }
    public void method3(){
        System.out.println("This is the method3 of class A");
    }
}

class BB extends AA{
    public void method2(){
        System.out.println("This is method of Class B");
    }

    // we overrride class A method1
    @Override
    public void method1(){
        System.out.println("This is metheod of Class B oveerride to Class A");
    }

}

public class j45DynamicMethodDispatch {  
    public static void main(String[] args){

        // Dynamic method approach
        // in this we use methods of super or base class except the derive or sub class override mmetheods 
        // sub class metheods not used only override metheods used
        AA a = new BB(); // A is Super class and B is sub class

        a.method1();
        a.method3();
        // a.method2(); // Not allowed because it on class BB
    }
}
