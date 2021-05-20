public class j31ProbReverseArrayBySwapping {
    public static void main(String[] args){
        // Reverse an Array
        int [] arr = {1,2,3,4,5,6 , 7};
        // [i] : [l-i-1]
        int swap;
        int l = arr.length;
        for (int x = 0 ; x<l/2; x++){
            swap = arr[x];
            arr[x] = arr[l-x-1];
            arr[l-x-1] = swap;
        }
        for (int i : arr) {
            System.out.println(i);
            
        }

    }
}
