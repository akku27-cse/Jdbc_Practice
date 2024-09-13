/*
 * 10 11 12
 * 20 21 22
 * 30 31 32
 * 
 * 
 */

import java.util.Scanner;

public class SpiralTraverse {
    public static void main(String[] args) {
        
          Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int mat[][]=new int[r][c];
    for(int i=0;i<r;i++){

        for(int j=0;j<c;j++){
            mat[i][j]=sc.nextInt();
        }
    }
// for(int i=0;i<mat.length;i++){
//     for(int j=0;j<mat[i].length;j++){
//         System.out.print(mat[i][j]);
//     }
    
// }

int minRow=0;
int minCol=0;
int maxRow=mat.length-1;
int maxCol=mat[0].length-1;
while (true) {
    //left box 
    for(int i=0,j=0;i<maxRow;i++){
        System.out.println(mat[i][j]);
    }
    minCol++;
    
    //bottom
for(int i=maxRow,j=minCol;j<=maxCol;j++){
System.out.println(mat[i][j]);
}
minRow++;

    //rigth wall
    for(int i=maxRow,j=maxCol;i>=minRow;--i){
        System.out.println(mat[i][j]);
        }
        maxCol++;
        //top boox
        for(int i=minRow,j=maxCol;j>=minCol;--j){
            System.out.println(mat[i][j]);
            }
maxRow++;
}
    }

}
