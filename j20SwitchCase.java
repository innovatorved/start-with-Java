import java.util.Scanner;

public class j20SwitchCase {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("__Start with Switch Case__");

        System.out.print("\nEnter a number between 1 to 5 : ");
        int val = sc.nextInt();
        // Switch case implementation
        switch(val){
            case 1:
                System.out.println("First Block Executed");
                break;

            case 2:
                System.out.println("Second Block Executed");
                break;

            case 3:
                System.out.println("Third Block Executed");
                break;

            case 4:
                System.out.println("fourth Block Executed");
                break;

            case 5:
                System.out.println("fifth Block Executed");
                break;

            default:
                System.out.println("When entered choice is other from Cases \"Choice Not Corect\"");
        }


    }
}