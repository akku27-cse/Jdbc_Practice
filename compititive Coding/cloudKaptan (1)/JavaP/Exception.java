public class Exception {
public static void add() throws ArithmeticException{
   //throw new ArithmeticException("This is the example of Throw keyword");
    int j=5/0;
    System.out.println(j);
    }
    public static void main(String[] args) {
        System.out.println("santu");
       add();
        System.out.println("jana");

    }

}

class A{
    void add() throws ArithmeticException{
        throw new ArithmeticException("This is the example of Throw keyword");
     
    }
}