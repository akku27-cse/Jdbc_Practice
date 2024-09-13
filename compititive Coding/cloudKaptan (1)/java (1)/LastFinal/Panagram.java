public class Panagram {
    public static void main(String[] args) {
        
        String str="yyabcdefghijklmnopqrstuvwxz";
boolean bol=true;
str.toLowerCase();
        if(str.length()<26){
            System.out.println("Not Panagrm");
            return;

        }else{
            for(char ch='a' ;ch<='z';ch++){
                if(str.indexOf(ch)<0){
                  //  System.out.println("Not Panagram");
                bol=false;
                }
            }
        }

        if(bol==true){
            System.out.println("Panagram");
        }else{
            System.out.println("Not panagram");
        }

    }
}
