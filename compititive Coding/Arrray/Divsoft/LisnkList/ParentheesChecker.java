public class ParentheesChecker {
  
  public static boolean isBalenced(String str){
    int i=-1;
    char stack[]=new char[str.length()];
    for(char ch:str.toCharArray()){
        if(ch=='('||ch=='{'||ch=='['){
            stack[++i]=ch;
        }else{
            if(stack[i]=='(' &&ch==')'||stack[i]=='{' && ch=='}'||stack[i]=='['&&ch==']'){
                i--;
            }else
            return false;
        }
    }
    return i==-1;
  }
  
    public static void main(String[] args) {
        String str="{[()]}  ";
        if(isBalenced(str)){
            System.err.println("balenced");
        }else{
            System.out.println("not balenced");
        }
  
    }
}
