/**
 * RecursionFactorial
 */
public class RecursionFactorial {


    public static int Factorial(int n){
if(n==0 || n==1)
return n;
return n*Factorial(n-1);

    }
    public static void main(String[] args) {
        int n=5;
int ans=Factorial(n);
System.out.println(ans);
    }
}