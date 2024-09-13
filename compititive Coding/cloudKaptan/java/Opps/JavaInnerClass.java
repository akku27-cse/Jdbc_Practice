public class JavaInnerClass {
    class Easy{
        void p(){
            System.out.println("This is the inner class");
        }
    }
    public static void main(String[] args) {
      JavaInnerClass j=new JavaInnerClass();
      JavaInnerClass.Easy e=j.new Easy();
      e.p();  
    }
}
