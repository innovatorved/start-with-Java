import java.util.Scanner;
public class j23ProblemCheckEnteredWebsiteTopDomainRelatedTo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Domain : ");
        String st = sc.nextLine();

        if (st.endsWith(".com")){
            System.out.println("Commercial Website");
        }
        else if (st.endsWith(".org")){
            System.out.println("Organizational Website");
        }
        else if (st.endsWith(".in")){
            System.out.println("Indian Website");
        }
        else {
            System.out.println("Not on list");
        }
    }
}
