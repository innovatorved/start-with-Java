import java.util.Scanner;

public class j14Strings {

    // Note : String the immutable and cannot be changed 
    public static void main(String[] args){
        String name = new String("Ved Prakash Gupta");
        System.out.println(name);

        // We Also Declare String like
        String nm = "Ved Gupta";
        System.out.println(nm);

        // Check length of String by 
        System.out.println(name.length());

        // String as a Input
        System.out.println("__Input String__");
        Scanner st = new Scanner(System.in);

        String str = st.nextLine();
        System.out.println("Print Input String : " + str);


    }
    
}
