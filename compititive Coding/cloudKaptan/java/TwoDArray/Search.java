import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int mat[][] = new int[r][c];
        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int x = 8;
        boolean bol=false;
        int i = 0, j = mat[0].length - 1;
        while (i < mat.length && j >= 0) {
            if (x == mat[i][j]) {
             System.out.println("found");
             bol=true;
             break;
                
            } else if (x < mat[i][j]) {
                j--;
            } else {
                i++;
            }
        }
        if(bol==false)
        System.out.println("Not found");
    }
}
