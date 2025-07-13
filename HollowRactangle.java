/*
    * * * * *
    *       *
    *       * 
    * * * * *
 */

public class HollowRactangle {
    public static void main(String[] args) {
        int rows=5;
        int cols=6;

        for (int i = 1; i < rows+1; i++) {
            for (int j = 1; j < cols+1; j++) {
                if (i==1 || j==1 || i==rows || j==cols) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
