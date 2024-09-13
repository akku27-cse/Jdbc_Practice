public class ParentheesChecker {
    public static void main(String[] args) {
        String str="{{{}}";
        int i=-1;
        char[] stack=new char[str.length()];
boolean bool=true;
if(str.length()%2!=0){
    System.out.println("not balenced");
    return;
}else{
        for(char ch:str.toCharArray()){
            if(ch=='{' || ch=='['|| ch=='('){
                stack[++i]=ch;
            }else 
            {
                if(i>=0 && (stack[i]=='{' && ch=='}') || (stack[i]=='{' && ch=='}')|| (stack[i]=='{' && ch=='}')){
i--;
            }else{
              bool=false;
            }
        }
        }
    }
        if(bool==true){
            System.out.println("Balenced");
        }else{
            System.out.println("Not Balenced");
        }
    }
}
