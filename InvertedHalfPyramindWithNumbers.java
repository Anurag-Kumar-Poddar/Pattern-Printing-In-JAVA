public class InvertedHalfPyramindWithNumbers {
    public static void main(String[] args) {
        int r = 6;
        for (int i = r; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
