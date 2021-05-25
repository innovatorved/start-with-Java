interface interface_x{
    void interface_x_meth1();
    String interface_x_meth2();

    default void default_x_meth3(){
        // we can directly executed in implement class or update this also
        System.out.println("this is interface metheod");
        private_x_interface_meth();
    } 

    private void private_x_interface_meth(){
        // not used outside from class 
        // but we can call this metheod from other metheod
        System.out.println("Private metheod not used outside from interface but we can call this metheod from other metheod ");
    }
}

class Base7 implements interface_x{
    public void interface_x_meth1(){
        System.out.println("interface_x_meth1 usid in Base7");
        // private_x_interface_meth();
    }
    public String interface_x_meth2(){
        return "interface_x_meth2 used in class : Base7 return string";
    }
}

public class j48DefaultAndPrivateMetheodInInterfaces {
    public static void main(String[] args){

        Base7 bb7 = new Base7();

        bb7.interface_x_meth1();
        System.out.println(bb7.interface_x_meth2());
        bb7.default_x_meth3();

    }
}
