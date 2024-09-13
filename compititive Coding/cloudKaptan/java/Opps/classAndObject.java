 class Practcice {
// public static void main(String[] args)
//    {
//     System.out.println(args);
//    } 



}
public class classAndObject {

    public static void main(String[] args) {
      //1.using new keyword 
       // Practcice p=new Practcice();
   //2 using New Instace
  try {
    Class cls=Class.forName("Practcice");

    Practcice p=(Practcice)cls.newInstance();
    System.out.println(p);
  } catch (Exception e) {
    // TODO: handle exception
    System.out.println(e);
  }

    }
}