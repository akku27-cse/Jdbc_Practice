import java.util.Scanner;

public class WaveTraverse {
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
for(int i=0;i<mat.length;i++){
    for(int j=0;j<mat[i].length;j++){
        System.out.print(mat[i][j]);
    }
    
}


for(int i=0;i<mat[0].length;i++){
//if even then nnicher dike  else oprer dike traverse korbe 
if(i%2==0){
for(int j=0;j<mat.length;j++){
System.out.println(mat[j][i]);
}

}else{
for(int j=mat.length-1;j>=0;--j){
    System.out.println(mat[j][i]);
}
}

}


    }
}
