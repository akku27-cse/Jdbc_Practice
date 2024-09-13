import java.util.Scanner;

public class Spiral {
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

        int minR=0;
        int minCol=0;
        int maxR=mat.length-1;
        int maxC=mat[0].length-1;
        int t=n*m,cnt=0;

        while (cnt<t) {
            //left walk
            for(int i=minR,j=minCol;i<maxR&&cnt<t;i++){
                System.out.print(mat[i][j]);
                cnt++;


            }minCol++;
            //buttom walk

            for(int i=maxR,j=minCol;j<=maxC && cnt<t;j++){
                System.out.print(mat[i][j]);
                cnt++;
            }
            maxR--;
            for(int i=maxR,j=maxC;i>=minR && cnt<t;i--){
System.out.print(mat[i][j]);
            }
            maxC--;
            for(int i=minR,j=maxC;j>=minCol && cnt<t;j--){
                System.out.println(mat[i][j]);
            }
minR++;



        }

    }
}
