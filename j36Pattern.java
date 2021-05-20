public class j36Pattern {
    public static void main(String[] args){
        for (int x = 4; x > 0 ; x--){
            for (int y = 0 ; y < x; y++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }

        for (int x = 0; x <= 4 ; x++){
            for (int y = 0 ; y < x; y++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
}
