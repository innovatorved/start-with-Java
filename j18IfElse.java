import java.util.Scanner;
public class j18IfElse {
    public static void main(String[] args){
        System.out.println("__Java-If-Else__");
        Scanner sc = new Scanner(System.in);
        System.out.print("Check whether input is greater lower or equal to 50 : ");

        int ele = sc.nextInt();
        if (ele<50){
            System.out.println(ele + " is Lower than 50");
        }
        else if (ele>50){
            System.out.println(ele + " is greater than 50");
        }
        else {
            System.out.println("Input is Equal to 50 ");
        }

    }
}
