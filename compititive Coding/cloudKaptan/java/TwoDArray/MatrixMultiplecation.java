import java.util.Scanner;
import java.util.*;
public class MatrixMultiplecation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int mat[][] = new int[r1][c1];
        for (int i = 0; i < r1; i++) {

            for (int j = 0; j < c1; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        // for (int i = 0; i < mat.length; i++) {
        //     for (int j = 0; j < mat[i].length; j++) {
        //         System.out.print(mat[i][j]);
        //     }
        //     System.out.println();
        // }
       
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int mat2[][] = new int[r2][c2];
        for (int i = 0; i < r2; i++) {

            for (int j = 0; j < c2; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        // for (int i = 0; i < mat2.length; i++) {
        //     for (int j = 0; j < mat2[i].length; j++) {
        //         System.out.print(mat2[i][j]);
        //     }
        //     System.out.println();
        // }

        if (c1 != r2) {
            System.out.println("Invalid");
            return;
        }
             int porduct[][]=new int[r1][c2];
             for(int i=0;i<porduct.length;i++){
                for(int j=0;j<porduct[0].length;j++){
                    for(int k=0;k<c2;k++){
                        porduct[i][j]+=mat[i][k]*mat2[k][j];
                    }
                }
             }

             for(int i=0;i<porduct[0].length;i++){
                for(int j=0;j<c2;j++){
                System.out.print(porduct[i][j]);
                }
                System.out.println();
             }
    }
}
