public class AsitisSpace {
    public static void main(String[] args) {
 char temp;       
        String str="my name is santua";
char ch[]=str.toCharArray();

      int lb=0,ub=ch.length-1;
      while(lb<=ub){
        if(ch[lb]==' '){
          lb++;
        }else if(ch[ub]==' '){
                ub--;
            }
            else{
        temp=ch[lb];
        ch[lb]=ch[ub];
        ch[ub]=temp;
        lb++;
        ub--;
            }
        
      }
      System.out.println(String.valueOf(ch));
    }
}
