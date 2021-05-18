import java.util.Scanner;

public class j21SwitchCaseWithString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("_Enter a String_ : ");
        String st = sc.nextLine();

        switch (st){
            case "ved":
                System.out.println("full name is Ved Prakash Gupta");
                break;

            case "ajay":
                System.out.println("Full Name is Ajay Sharma");
                break;

            case "Sudhanshu":
                System.out.println("Full name is Chotu");
                break;
            default:
                System.out.println("Name not founs in Database");
        }
    
        // System.out.println(st);
        
    }
}
