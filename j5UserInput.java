//j5_user_input
import java.util.Scanner;

public class j5UserInput{
    public static void main(String[] args){
        System.out.println("Input in Java");

        Scanner sc = new Scanner(System.in); //read data  from keyboard we define object once then we use in program\

        System.out.print ("Enter scber 1 : ");
        // int a = num.nextInt();
        float a = sc.nextFloat();

        System.out.print("\nEnter scber 2 : ");
        // int b = num.nextInt();6
        float b = sc.nextFloat();

        float sum = a + b;
        System.out.println("Sum of Two Numbers is : " + sum);

        System.out.println("String Input");
        Scanner sc2 = new Scanner(System.in);
        String c = sc.next();  // if we not define input type it by default set to String
        System.out.println(c); // but it only accept first word from input

        // from input whole line we use
        String str2 = sc2.nextLine();
        System.out.println(str2);  
    }
}