public class Halfpyramid1 {
    
public static void Row(int n,int i){
if(i<=n){
    System.out.println();
    Col(1,i);
    Row(n, i+1);
}
}
public static void Col(int j,int i){
    if(j<=i){
        System.out.print("* ");
        Col(j+1, i);
    }

}
    
    
    
    public static void main(String[] args) {
    //  for(int i=0;i<5;i++){
    //     for(int j=0;j<5;j++){
    //         if(i>j){
    //             System.out.print("* ");
    //         }
    //         System.out.print(" ");
    //     }
    //     System.out.println();
    //  }
    Row(5,1);
    

    }
}

