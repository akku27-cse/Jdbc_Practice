public class HalfPyramid2 {

    public static void Row(int i, int n) {

        if (i <= n) {
           
            Colspace(1, n, i);
            ColData(1, i);
            System.out.println();
            Row(i + 1, n);
        }
    }

    // for print space
    public static void Colspace(int j, int n, int i) {
        if (j <= (n - i)) {
            System.out.print(" ");
            Colspace(j + 1, n, i);
        }
    }

    public static void ColData(int k, int i) {
        if (k <= i) {
            System.out.print("* ");
            ColData(k + 1, i);
        }
    }

    public static void main(String[] args) {
        Row(1, 5);

    }
}
