public class Inheritence {

public static void main(String[] args) {
    Third t=new Third();
    System.out.println(t.z);
    System.out.println(t.t1);
}
    
}


class First{
int x=8;
}

//single Inheritence
class Second extends First{
int y=9;

}
//multilevel
class Third extends Second{
int z=this.x+this.y;
int t1=x+y;

}
//hyarchical inheitences
class Fourth extends Second{

}

//multipule 
interface add{

}
class Six extends Fourth implements add{

}