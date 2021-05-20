public class j34VarArgs {
    static int sum(int ...arr){
        //avail as int [] arr
        int s = 0;
        for (int i : arr){
            s += i;
        }
        return s;
    }
    static int sum2(int x , int ...arr){
        //avail as int [] arr
        // we also add other parameter formetheod
        int s = x;
        for (int i : arr){
            s += i;
        }
        return s;
    }
    public static void main(String[] args){
         // VarArgs simililar to python *args
         int s = sum(1,2,3,4,5,6);
         System.out.println(s);

         int x = sum2(1,2,3,4,5,6);
         System.out.println(x);
    }
}
