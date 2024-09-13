public class PanagramAndAnagram {
public static void main(String[] args) {
    
String Pana="abcdefghijkmlnno pqrstuvwxyz";
String ana="santu";
String target="utabs";
//panagram
Pana.toLowerCase();
boolean b=true;
if(Pana.length()<26){
    System.out.println("Not Panagarram");
    return;
}else{
    for(char ch='a';ch<='z';ch++){
     if(Pana.indexOf(ch)<0){
        System.out.println("Not pana");
        b=false;
        break;
     }
     
    }
  
}
if(b){
    System.out.println("PAnagram");
}


}


}
