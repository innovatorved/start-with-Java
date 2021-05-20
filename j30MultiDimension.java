import java.util.Scanner;

public class j30MultiDimension {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        // MultiDimensional Array
        int [][] arr = new int [2][3];
        
        // input an MultiDimensional array
        System.out.println("Input Array is : ");
        for (int x = 0 ; x < arr.length; x++){
            for(int y = 0; y < arr[0].length; y++){
                System.out.printf("\nEnter the value of arr[%d][%d] : " , x , y);
                arr[x][y] = sc.nextInt();
            }
        }

        // print an Multi Dimensional Array
        System.out.println("\n\nPrinted Array is : ");
        for(int [] arr1 : arr){
            for (int a : arr1){
                System.out.printf("\n __%d__",a);
            }
        }

        // System.out.println(arr.length);
    
    }
}
