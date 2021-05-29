class AccessModifier{
    // variable access modifiers
    int a = 45;
    public int b = 78;
    protected int c = 99;
    private int d = 178;

    public void meth1(){
        // we can acces aal modifiers usinng  an self class method
        System.out.println("\nwe can acces all modifiers in Same Class");
        System.out.printf("\nPrint default Modifier int a = %d" ,a);
        System.out.printf("\nPrint public Modifier int b = %d" ,b);
        System.out.printf("\nPrint protected Modifier int c = %d" ,c);
        System.out.printf("\nPrint private Modifier int d = %d" ,d);
    }

}
class AccessModifier2 extends AccessModifier{
    public void meth2from2() {
        // Private var not accessable by extends class
        System.out.println("\nwe can acces all modifiers in Same Class");
        System.out.printf("\nPrint default Modifier int a = %d" ,a);
        System.out.printf("\nPrint public Modifier int b = %d" ,b);
        System.out.printf("\nPrint protected Modifier int c = %d\n" ,c);
        //System.out.printf("\nPrint private Modifier int d = %d" ,d);
    }
}

public class j50AccessModifier{
    public static void main(String[] args){
        // Access Modifiers
        AccessModifier AC = new AccessModifier();
        // AC.meth1();
        
        // Access var in same file or package
        System.out.printf("\n Defalut : %d , Public : %d , Protected : %d , Private : we won't access private var from different class " , AC.a , AC.b , AC.c);

        // Access sub class
        AccessModifier2 AC2 = new AccessModifier2();
        AC2.meth2from2();
        System.out.println(AC2.c);
    }
}