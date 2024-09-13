public class FirstRecursion{

public static void Print(int n){
    if(n>0){
        Print(n-1);
        System.out.println(n);
    }
  

}

    public static void main(String[] args) {
    int n=12;
Print(n);
    }
}