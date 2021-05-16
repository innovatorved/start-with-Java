import java.util.Scanner;
public class j10ResultingDataType {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // boolean a = sc.hasNextInt();
        byte x = 5;
        int y = 45;
        short z = 8;
        float b = 6.55f + x;  // evaluatein float
        System.out.println(b);

        System.out.println(x+y+z);
        // evaluate in int

        //Increment and Decrement Operator
        int i = 6;
        System.out.println(i++); // program prints value of i and increse i by 1

        // and if we again try to print i value then it increase
        System.out.println(i);

        // And if wwe add ++ before i then i first increase then print

        System.out.println(++i);
        System.out.println(i);


    }
    
}
