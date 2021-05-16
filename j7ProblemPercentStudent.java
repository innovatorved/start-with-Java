
import java.util.Scanner;

public class j7ProblemPercentStudent{
    public static void main(String[] args)
    {
        System.out.println("Student Marks to Percent Calculator");

        Scanner marks = new Scanner(System.in);

        System.out.println("Enter Your Masks and Total Marks : ");

        int mas = marks.nextInt();
        int t_mas = marks.nextInt();

        float percent = (mas * 100)/t_mas ;
        System.out.println(percent + "%");


    }
}