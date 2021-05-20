public class j35Recursion {
    static int fact(int n){
        if ( n == 0 ){
            return 1;
        }
        else{
            return n* fact(n-1);
        }
    }
    public static void main(String[] args){
        int a = fact(0);
        System.out.println(a);
    }
}
