public class j12ProblemChatIntAdd {
    public static void main(String[] args){
        // Program to add num in charachter and again extract character from number

        char a = 'B';

        char b = (char) (a+4); // this is typecasting change output in char
        // add four 4th next character in A
        
        System.out.println(b); // Output is : F

        // Reverse the process
        char c = (char) (b-4);
        System.out.println(c);

        String sc = "Ab";
        System.out.println(sc);

        char ch = 'A';
        char ch2 = 'B';
        sc = (String)(sc+ch+ch2);
        
        System.out.println(sc);
    }
}
