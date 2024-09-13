import java.util.Scanner;

/**
 * TwoDArray
 */
public class TwoDArray {

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
        // display
        // System.out.println("Disply the result");
        // for(int i=0;i<mat.length;i++){
        // for(int j=0;j<mat[0].length;j++){
        // System.out.print(mat[i][j]+" ");
        // }
        // System.out.println();
        // }

        // addition

        // Insert
        System.out.println("Enter The Number of Row");
        int n2 = sc.nextInt();
        System.out.println("ENter the Number Of  Column");
        int m2 = sc.nextInt();
        int mat2[][] = new int[n2][m2];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        int mat3[][] = new int[3][3];
        if (n != n2 && m2 != m) {
            System.out.println("Addition not posssible");
            return;
        } else {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    mat3[i][j] = mat[i][j] + mat2[i][j];
                    System.out.print(mat3[i][j]+" ");
                }
                System.out.println();
            }

        }
        //display
// System.out.println("Disply the result");
// for(int i=0;i<mat3.length;i++){
//     for(int j=0;j<mat3[0].length;j++){
//        System.out.print(mat3[i][j]+" ");
//     }
//     System.out.println();
// }

    }
}