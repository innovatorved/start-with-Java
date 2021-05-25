class Base3{
    Base3(int x){
        // int x = 10;
        System.out.println("\n BAse Class Constriuctor x input : " + x);
    }

}
class Derive extends Base3{
    Derive(int x){
        //int x = 15;
        super(x);
        System.out.println("\n Derive class Constructor input x : "+x);
    }
}
class for_this{
    int x = 10;
    for_this(int x){
        // if variable name are in same in class and instance we use this for define it is class variable
        System.out.println("Before this.x value : "+ this.x);
        this.x = x;
        System.out.println("After this.x value : "+ this.x);
    }
}
public class j43thisAndSuper {
    public static void main(String[] args){
        //==============================================
        // derived function always call the constructor with no argument
        // is they not find base constructor with no argument it produce an error
        // use super keyword if we execute base class with arguments

        Derive dr = new Derive(10);

        for_this ft = new for_this(111);
    }
}
