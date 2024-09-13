class Overrinding{
    public static void main(String[] args) {
        
      
        B b=new A();
        b.p();
    }
}



class A{
    void p(){
        System.out.println("p");
    }
}
class B extends A{
    void p(){
        System.out.println("f");
    }
}