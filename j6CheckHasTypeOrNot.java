// j6CheckHasTypeOrNot.java
import java.util.Scanner;

public class j6CheckHasTypeOrNot{
    public static void main(String[] args){

        Scanner num = new Scanner(System.in);
        System.out.print("Check Input is Integer or not : ");

        boolean ch_int = num.hasNextByte();
        System.out.println(ch_int);
    }
}