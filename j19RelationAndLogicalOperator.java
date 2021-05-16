public class j19RelationAndLogicalOperator {
    public static void main(String[] args){
        /*
            Relational Operator
            >   : Greater than
            <   : Lowee than
            >=  : Greater Than Equal to
            <=  : Lower than Equal to
            !=  : Not Equal to
            ==  : check Equal to  

            All Relational Operator always return Boolean value
            And we also use these operators in if - else

        */
        /*
            Logical operator 

            &&  : And
            ||  : Or
            !   : Not

            Same as And , Or , Not Gate
        */
        System.out.println(5>2);
        System.out.println(2<5);
        System.out.println(5==2);
        System.out.println(5!=2);
        System.out.println(5<=22);

        // Logical operator example
        if (5>2 && 5 >1){
            System.out.println("Both True So this parra Executed");
        }
        if (5==2 || 5>2){
            System.out.println("If any One if True then Block Executed");
        }

    }
}
