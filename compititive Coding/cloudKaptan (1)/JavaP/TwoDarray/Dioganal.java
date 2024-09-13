import java.util.Scanner;

public class Dioganal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Insert
        System.out.println("Enter The Number of Row");
        int n = sc.nextInt();
        System.out.println("ENter the Number Of  Column");
        int m = sc.nextInt();
        int mat[][] = new int[n][m];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0, k = i; k < mat.length; k++, j++) {
                System.out.println(mat[i][j]);
            }
        }
    }
}
