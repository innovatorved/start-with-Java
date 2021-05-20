public class j11IncrementAndDecrement {
    public static void main(String[] args){
        // start with increment
        int a = 50;
        int b = 60;
        int c = 79;

        float d = 15.3f;
        double e = 7895d;

        char f =  'a';

        System.out.println(f++);  // first print value of variable f and then increment it
        System.out.println(f);

        System.out.println(++a); // first increase var a value then print
        System.out.println(a);

        float fl = ++a * b++ + ++c;
        System.out.println(fl);

        System.out.println(a + " " + b + " " + c);

        // decrement 
        System.out.println(a);
        System.out.println(--a);
        System.out.println(a--);
        System.out.println(a);

    }
}
