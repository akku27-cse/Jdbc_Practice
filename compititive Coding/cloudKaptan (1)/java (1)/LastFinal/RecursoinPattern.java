/**
 * RecursoinPattern
 */
public class RecursoinPattern {


    public static void Row(int i,int n){
    
        if(i<=n){
System.out.println();
        Col(1,i);
        Row(i+1, n);
     }
    }
    public static void Col(int j,int i){
        if(j<i){
            System.out.print("* ");
            Col(j+1, i);
        }

    }
    public static void main(String[] args) {
        int n=5;
        Row(1,n);
    }
}