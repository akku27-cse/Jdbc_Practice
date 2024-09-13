public class Consructor {

public static void main(String[] args) {
    Easy e=new Easy();
//copy constructor

    Easy e2=e;

}

}

class Easy{
    int x=8;
    Easy(){

int y=this.x;
System.out.println(y);    
}
}