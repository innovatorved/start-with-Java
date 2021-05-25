import static java.lang.System.out;

interface inter1{
    void meth1();
    void meth2();
}
interface inter2 extends inter1{
    // extends the features of inter1 interface
    void meth3();
    default void meth4(int a){
        out.printf("Entered element is Increment by 1 : [%d] \n",a);
    }

}

class Base8 implements inter2{
    int a;
    Base8(int a){
        this.a = a;
    }
    @Override
    public void meth1() {
        // TODO Auto-generated method stub
        System.out.println("meth1 belongs to inter1 ");
        
    }
    @Override
    public void meth2() {
        // TODO Auto-generated method stub
        System.out.println("meth2 belongs to inter1 ");
        
    }
    @Override
    public void meth3() {
        // TODO Auto-generated method stub
        System.out.println("meth3 belongs to inter2 ");
        
    }
    

}
public class j49InheritanceInInterfaces {
    public static void main(String[] args){
        Base8 bb8 = new Base8(22);
        System.out.println(bb8.a);  // value set of A
        bb8.meth4(1000);
        bb8.meth1();
        bb8.meth3();

    }
}
