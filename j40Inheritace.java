class Base{
    int x , y;

    public void value_set (int a , int b){
        // Constructor
        x = a;
        y = b;
    }
    public int value(){
        return x+y;
    }
    
}
class Parent extends Base{
    public int value(){
        // if same name function in both class it executes own class meetheod
        return x;
    }

    public int value_xy(){
        return x*y;
    }
}

public class j40Inheritace{
    public static void main(String[] args){
        Base baseClass = new Base();
        Parent Exten_Parent = new Parent();

        // features on Base class copy to Parent Class
        // set values in Parent class 
        Exten_Parent.value_set(10,45); // this is the metheod of base class

        // add of both values
        System.out.println(Exten_Parent.value()); // metheod present in base  and parentboth so they use its own parent class metheod

        // using parent class metheod
        System.out.println(Exten_Parent.value_xy());



    }
}