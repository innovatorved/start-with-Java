public class j27BreakAndContinue {
    public static void main(String[] args)
    {
        System.out.println("__Beak in Java__");

        // Break use to end the loop
        System.out.println("if i == 2 then loop is breaak ");
        int i = 10;
        while(i<=10)
        {
            System.out.println(i);
            if (i==2)
            {
                System.out.println("i == 2 so loop breaked");
                break;
            }
            i--;
        }

        System.out.println("Continue in java");
        // continue stop the iteration and execute next iteration
        System.out.println("if j == 2 then loop is breaak ");
        int j = 10;
        while(j<=10 && j>= -10)
        {
            
            if (j==2)
            {
                System.out.println("j == 2 so loop Continued down task not executed");
                j--;
                continue;
            }
            System.out.println(j);
            j--;
        }
    }
}
