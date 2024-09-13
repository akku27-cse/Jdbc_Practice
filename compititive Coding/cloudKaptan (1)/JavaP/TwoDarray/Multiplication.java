import java.util.Scanner;

public class Multiplication {
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

        System.out.println("Enter The Number of Row of matrix 2");
        int n1 = sc.nextInt();
        System.out.println("ENter the Number Of  Column of matrix 2");
        int m1 = sc.nextInt();
        int mat2[][] = new int[n1][m1];
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[0].length; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
       int product[][]=new int[m][n1];
        if(m!=n1){
            System.out.println("Multiplication not possible");
        return;
        }else{
            for(int i=0;i<product.length;i++){
                for(int j=0;j<product[0].length;j++){
                    for(int k=0;k<n1;k++){
                        product[i][j]+=mat[i][k]*mat2[k][j];
                    }
                }
            }
        }
         System.out.println("Disply the result");
for(int i=0;i<product.length;i++){
    for(int j=0;j<product[0].length;j++){
       System.out.print(product[i][j]+" ");
    }
    System.out.println();
}
    }
}
