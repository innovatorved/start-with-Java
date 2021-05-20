public class j33MethodOverloading {
    static void hello(){
        System.out.println("hello Sir");
    }
    static void hello(String x){
        System.out.println("Hello "+x);
    }
    static void hello(String x , int y){
        System.out.println("Hello "+x + y);
    }
    public static void main(String[] args){

        // Metheod Overloading
        // we can make many metheods from same by changing input parameters doesnot depends upon return
        hello();
        hello("ved");
        hello("dev" , 56);

    }
}
