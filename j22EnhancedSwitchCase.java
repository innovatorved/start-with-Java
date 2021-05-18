import java.util.Scanner;

public class j22EnhancedSwitchCase {
    public static void main(String[] args){

        System.out.println("__Enhanced Switch Class__\n");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Snter a number : ");
        int num = sc.nextInt();

        switch(num){
            case 1 -> System.out.println("Belongs to class 1");  // for sinngle task execution
            case 2 -> {
                // for multiple task Execution
                System.out.println("Belongs to class 2");
                System.out.println("Belongs to class 2");
                System.out.println("Belongs to class 2");
            }
            case 3 -> System.out.println("Belongs to class 3");

            default -> System.out.println("Wrong Choice");
        }
    }   
}
