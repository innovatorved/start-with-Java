import java.util.Scanner;

public class j8Operators {
    public static void main(String[] args){
        System.out.println("Operators in Java");
        Scanner sc = new Scanner(System.in);

        byte a = 5;
        byte b = (byte) (4 + a); // we add casting
        System.out.println(b);

        a = 50; // notbeen changed
        System.out.println(b);

        

    }
}
