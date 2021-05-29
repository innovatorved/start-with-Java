import com.company.AccessModifier;
import com.company.AccessModifier2;
// import from another class
class AccessModifier4 extends AccessModifier2{

}
class AccessModifier3 extends AccessModifier{
    public void meth4(){
        System.out.printf("\nPrint default Modifier int a = %d" ,a);
        System.out.printf("\nPrint public Modifier int b = %d" ,b);
        System.out.printf("\nPrint protected Modifier int c = %d" ,c);
        // System.out.printf("\nPrint private Modifier int d = %d" ,d);
    }
} 
public class j51AccessModifier2 {
    public static void main(String[] args){

        AccessModifier AC = new AccessModifier();
        //AC.meth1();

        // we cannot acces frivate if importing the class
        System.out.printf("\nPrint default Modifier int a = %d" ,AC.a);
        System.out.printf("\nPrint public Modifier int b = %d" ,AC.b);
        System.out.printf("\nPrint protected Modifier int c = %d" ,AC.c);
        // System.out.printf("\nPrint private Modifier int d = %d" ,AC.d);

        AccessModifier3 AC3 = new AccessModifier3();
        AC3.meth4();

        AccessModifier4 AC4 = new AccessModifier4();
        System.out.println(AC4.b);

    }
}
