public class Butterfly {
     
    public static void main(String[] args) {
        int r = 6;
        for (int j = 1; j <= r; j++) {
            for (int j2 = 1; j2 <= j; j2++) {
                System.out.print("*");
            }
            for (int j2 = 1; j2 <= r-j; j2++) {
                System.out.print(" ");
            }
            for (int j2 = 1; j2 <= r-j; j2++) {
                System.out.print(" ");
            }
            for (int j2 = 1; j2 <= j; j2++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int j = r; j >= 1; j--) {
            for (int j2 = 1; j2 <= j; j2++) {
                System.out.print("*");
            }
            for (int j2 = 1; j2 <= r-j; j2++) {
                System.out.print(" ");
            }
            for (int j2 = 1; j2 <= r-j; j2++) {
                System.out.print(" ");
            }
            for (int j2 = 1; j2 <= j; j2++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
