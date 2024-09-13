class A{
    void main(int j){
        System.out.println(j+1);
    }


}
class B extends A{
    void main(int j){
        System.out.println(j+2);
    }
}




public class Constructor3 {
    


    public static void main(String[] args) {
        
       A a=new B();
       a.main(5);
    }
}
