public class Encpsulation {
    public static void main(String[] args) {
        Child c=new Child();
        // c.Add();
Easy e =new Easy();
    }
}

class Easy{
    int x=9;
    private int y=9;
//     public void Add(){
//     int p=y;
// System.out.println(p);

//     }
}
class Child extends Easy{

}