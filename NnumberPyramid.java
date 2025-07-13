public class NnumberPyramid {
    public static void main(String[] args) {
        int r = 6;
        int num = 0;
        for (int i = 1; i <= r; i++) {
            num = i;
            for (int j = 1; j <= r-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(num+" ");   
            }
            System.out.println();
        } 
    }
}
