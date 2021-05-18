public class j28Array {
    public static void main(String[] args){

        // genrate array
        int [] arr1; // Declaration
        arr1 = new int [5]; // memory allocation

        int [] arr2 = new int[5];  // Declaration + memory allocation

        int [] arr3 = {1,2,3,4,5,6,7,8,9,0}; // declare + initialize
        System.out.println(arr3[5]);

        // Declare values in array 1
        arr1[0] = 1;
        arr1[1] = 3;
        arr1[2] = 5;
        arr1[3] = 7;
        arr1[4] = 9;
        // System.out.printf("\n\n %d %d %d %d %d " ,arr1[0] ,arr1[1] ,arr1[2] , arr1[3] ,arr1[4]);

        // findlength of array
        System.out.println("\nArray1 length is : "+arr1.length+"\n\n");

        //print 1 by 1 arr 1
        for(int i = 0 ; i < arr3.length; i++){
            System.out.println(arr3[i]);

        // print in reverse order
        for (int j = arr3.length-1; j>=0; j--){
            System.out.println(arr3[j]);
        }

        }
        
    }
    
}
