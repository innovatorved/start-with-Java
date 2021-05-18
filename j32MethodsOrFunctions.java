public class j32MethodsOrFunctions {
    
    static int Add(int x , int y){
        // Static Method Directly call from main metheod
        return (x+y);
    }

    int Multiply(int x , int y){
        // The method not directly call by main metheod we need to specify the object
        return (x*y);
    }
    public static void main (String[] args){
        // Metheod in java and techniques to call a metthod
        int sum = Add(2 , 5);
        System.out.println(sum);

        j32MethodsOrFunctions Mul = new j32MethodsOrFunctions(); // clas object were creted
        // then we easily call the metheod
        int multiply = Mul.Multiply(2, 5);
        System.out.println(multiply);

    }
}