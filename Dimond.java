public class Dimond {
    public static void main(String[] args) {
        int r = 6;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r-i; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        for (int i = r-1; i >= 1; i--) {
            for (int j = 1; j <= r-i; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
