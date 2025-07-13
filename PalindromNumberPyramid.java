public class PalindromNumberPyramid {
    public static void main(String[] args) {
        int r = 5;

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r-i; j++) {
                System.out.print("\t");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j+"\t");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}
