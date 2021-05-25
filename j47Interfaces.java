interface interface_a{
    int a = 45; //value on interface is final not change
    public void meth1();
    public void meth2();
}
interface interface_b{
    void meth3();
    void meth4();
}


class Base5 implements interface_a {
    public void meth1(){
        System.out.println("meth1 of interface_a used in Base5 class ");
    }
    public void meth2(){
        System.out.println("meth2 of interface_a used in Base5 class ");
    }
}

//we can also create class with 2 interfaces
class Base5_class2_interface implements interface_a , interface_b{
    public void meth1(){
        System.out.println("meth1 of interface_a used in Base5_class2_interface class ");
    }
    public void meth2(){
        System.out.println("meth2 of interface_a used in Base5_class2_interface class ");
    }
    public void meth3(){
        System.out.println("meth3 of interface_b used in Base5_class2_interface class ");
    }
    public void meth4(){
        System.out.println("meth4 of interface_b used in Base5_class2_interface class ");
    }

}
// we can also create extend classes with interface
class Base5_exten_interface extends Base5 implements interface_b{
    //extends and interface both
    public void meth3(){
        System.out.println("meth3 of interface_b used in Base5_exten_interface class ");
    }
    public void meth4(){
        System.out.println("meth4 of interface_b used in Base5_exten_interface class ");
    }
}

public class j47Interfaces {

    public static void main (String[] args){
        Base5 bb = new Base5();
        Base5_class2_interface bbi = new Base5_class2_interface();
        Base5_exten_interface bei = new Base5_exten_interface();

        bb.meth2();
        bbi.meth3();

        bei.meth1();
        bei.meth4();
    }
}