public class nonRepeating {
    public static void main(String[] args) {
        String str="ssassbc";
        for(int i=0;i<str.length();i++){
            boolean bol=true;
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j) && i!=j)
            bol=false;
            }
            if(bol==true){
                System.err.println(str.charAt(i));
            }
        }
    }
}
