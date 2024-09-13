public class AllRecursion {
    

    public static int FAtorial(int n){
        if(n==0 ||n==1) return n;
        return n*FAtorial(n-1);
    }
    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    
    public static void main(String[] args) {
        int n=8;
        System.out.println(FAtorial(n));
    for(int i=0;i<n;i++){
        System.out.println(fibonacci(i));
    }
    
    }
}
