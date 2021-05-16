import javax.swing.event.SwingPropertyChangeSupport;

public class j15DifferentWaysToPrintInJava {
    // Different Ways to print in java
    public static void main(String[] args){
        System.out.println("\nDifferent Ways to print in java\n");

        System.out.print("System.out.print --> print not create new line");

        System.out.println("  System.out.println --> Print and create New Line");

        // like C printf
        int a = 5;
        float b = 0.009f;
        char c = 'A';
        String st = "Hello this is String";
        System.out.printf("This is like C and C++ Prrint");
        System.out.printf("int [%d] , float[%f] , char[%c] , String[%s]" , a , b , c , st);  // not create new line

        System.out.format("int [%d] , float[%f] , char[%c] , String[%s]" , a , b , c , st); // not create new line
        // System.out.println("hello");

        //we also make some changes by printf  and format
        int z = 56;
        float y = 44.0123456f;

        System.out.printf("It only returnss two value after decimal [%.2f]" , y);

        System.out.printf("\n\nIt return all value in 7 space [%7d] " , z);



    }
}