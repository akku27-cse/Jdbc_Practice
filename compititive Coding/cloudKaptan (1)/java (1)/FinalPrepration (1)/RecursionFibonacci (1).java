public class RecursionFibonacci {
    
public static int fibo(int n){
    //base case
    if(n<=1){
        return n;
    }
    return fibo(n-1)+fibo(n-2);
}
    public static void main(String[] args) {
        int no=8;
        for(int i=0;i<no;i++){
            System.out.println(fibo(i));
        }
    }
}
