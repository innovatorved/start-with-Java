public class j9PrecedenceAssocitivity {
    public static void main(String[] args){

        /* Precedence 
            1. / * 
            2. + -

        */
        /* Associativity defines that where to start solving left to right or right to left 
            if two or more symbol from same precedence
        */

        int a = 5;
        int b = 10;
        float c = 1.5f;
        float d = 10;

        float e = a * b / c / d; //Associativity Left to Right

        System.out.println(e);

    }
}
