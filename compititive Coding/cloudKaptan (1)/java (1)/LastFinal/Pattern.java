public class Pattern {
//for  *
//    * *

public static void Row(int i,int n){

if(i<=n){
Space(1,n,i);
J1(1,i);
J2(2, i);
System.out.println();
Row(i+1, n);
}

}
public static void Space(int k,int n,int i){
    if(k<=n-i){
        System.out.print(" ");
        Space(k+1, n, i);
    }
}
public static void J1(int j1,int i){
    if(j1<=i){
        System.err.print("* ");
        J1(j1+1,i);

    }
}


public static void J2(int j2,int i){
    if(j2<=i){
        System.out.print("* ");
        J2(j2+1, i);
    }
}


    public static void main(String[] args) {
        int n=5;
        Row(1,n);
    }
}
