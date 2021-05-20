public class j32MethodsOrFunctions {
    
    static int Add(int x , int y){
        // Static Method Directly call from main metheod
        return (x+y);
    }

    int Multiply(int x , int y){
        // The method not directly call by main metheod we need to specify the object
        return (x*y);
    }
    static void arrChng(int [] arr){
        arr[0] = 1;
        arr[1] = 2;
    }
    public static void main (String[] args){
        // Metheod in java and techniques to call a metthod
        int sum = Add(2 , 5);
        System.out.println(sum);

        j32MethodsOrFunctions Mul = new j32MethodsOrFunctions(); // clas object were creted
        // then we easily call the metheod
        int multiply = Mul.Multiply(2, 5);
        System.out.println(multiply);

         //Object and Array will change if we pass this through an metheod and chnage object inside this methed
         int [] arr1 = {9,8,7,4,5};
         arrChng(arr1);
         System.out.printf("Changes : [%d] [%d]\n\n" , arr1[0] , arr1[1]); // element changed inside a metheod
         for (int i : arr1) {
             System.out.println(i);
         }

    }
}