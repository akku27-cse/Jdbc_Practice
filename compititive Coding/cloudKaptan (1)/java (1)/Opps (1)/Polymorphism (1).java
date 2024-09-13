/**
 * Polymorphism
 */
public class Polymorphism {

    

    public static void main(String[] args) {
        
        // Simple s=new Simple();
        // s.Santu();
        // s.Santu("Santu eating..");
        // s.Santu(8);
        // main(90);
        Simple s=new Create();

        s.Santu();
         s.Santu("hii");
    }
    public static void main(int y){
        System.out.println(y);
    }
}
class Simple{

    void Santu(int x){
        System.out.println(x);
    }
    void Santu(){
        int x=9,y=9,z=x+y;
        System.out.println(z);
    }
    void Santu(String str){
        System.out.println(str);
    }
}
class Create extends Simple{
    void Santu(String str){
        System.out.println(str);
    }
}