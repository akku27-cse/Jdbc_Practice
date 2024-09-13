/**
 * nthFibo
 */
public class nthFibo {


     public static int NthFibonacci(int n){
       //int a=0,b=1;
       if(n<=1){
        return n;
       }
    return NthFibonacci(n-1)+NthFibonacci(n-2);

     }
    public static void main(String[] args) {
        int n=9;
System.out.println(NthFibonacci(n));

    }
}