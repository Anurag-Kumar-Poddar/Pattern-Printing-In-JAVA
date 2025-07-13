public class InvertedHalfPyramind {
    public static void main(String[] args) {
        int r = 6;
        for (int i = r; i >= 1; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
