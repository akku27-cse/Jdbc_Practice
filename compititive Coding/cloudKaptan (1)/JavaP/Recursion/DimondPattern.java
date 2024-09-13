public class DimondPattern {
    public static void Row1(int i, int n) {

        if (i <= n) {
           
            Colspace1(1, n, i);
            ColData1(1, i);
            System.out.println();
            Row1(i + 1, n);
        }
    }

    // for print space
    public static void Colspace1(int j, int n, int i) {
        if (j <= (n - i)) {
            System.out.print(" ");
            Colspace1(j + 1, n, i);
        }
    }

    public static void ColData1(int k, int i) {
        if (k <= i) {
            System.out.print("* ");
            ColData1(k + 1, i);
        }
    }
    public static void Row(int i, int n) {

        if (i <= n) {
            ColData(1, i);
            Colspace(1, n, i);
          
            System.out.println();
            Row(i + 1, n);
        }
    }

    // for print space
    public static void Colspace(int j, int n, int i) {
        if (j <= (n - i+1)) {
            System.out.print("* ");
            Colspace(j + 1, n, i);
        }
    }

    public static void ColData(int k, int i) {
        if (k <= i) {
            System.out.print(" ");
            ColData(k + 1, i);
        }
    }
    public static void main(String[] args) {
        Row1(1, 5);
        Row(1, 5);
    }
}
