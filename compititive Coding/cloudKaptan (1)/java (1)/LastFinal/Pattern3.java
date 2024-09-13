public class Pattern3 {

    public static void Row(int i,int n){
        if(i<=n){

        Space(2, i);
        Data(1,n,i);
        System.out.println();
        Row(i+1, n);
        }
    }

    public static void Space(int k, int i) {
        if (k <= i) {
            System.err.print(" ");
            Space(k + 1, i);
        }

    }

    public static void Data(int j, int n, int i) {
      if(j<=n-i+1){
        System.err.print("* ");
        Data(j+1,n,i);
      }
    }

    public static void main(String[] args) {
        int n = 5;
        Row(1, n);
    }
}
