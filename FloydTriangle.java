public class FloydTriangle {
    public static void main(String[] args) {
        int r = 6;
        int count = 1;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count+"\t");
                count++;
            }
            System.out.println("");
        }
    }
}
