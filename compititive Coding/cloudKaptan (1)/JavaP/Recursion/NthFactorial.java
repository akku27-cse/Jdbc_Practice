public class NthFactorial {
    
public static int NthFact(int n){
if(n==0){
   return 1;
}

    return n*NthFact(n-1);
}
    public static void main(String[] args) {
        //int n=5;
        System.out.println(NthFact(5));
    }
}
