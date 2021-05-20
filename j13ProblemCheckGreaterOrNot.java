import java.util.Scanner;

public class j13ProblemCheckGreaterOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Check No. is Greater then 5 or Not

        int num = 50;

        System.out.print("Enter a Number : ");
        int input_num = sc.nextInt();

        System.out.println(num>input_num);
    }
}
