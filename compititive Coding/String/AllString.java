import java.util.Arrays;

/**
 * AllString
 */
public class AllString {

    public static void main(String[] args) {

        /*
         * Anagram
         * String str = "santu";
         * String str2 = "utasn1";
         * 
         * if (str.length() != str2.length()) {
         * System.out.println("This in nott");
         * return;
         * 
         * } else {
         * 
         * char ch1[] = str.toCharArray();
         * char ch2[] = str.toCharArray();
         * 
         * Arrays.sort(ch1);
         * Arrays.sort(ch2);
         * 
         * if(Arrays.equals(ch1, ch2)){
         * System.out.println("This is anagram");
         * }else{
         * System.out.println("Not Anagaram");
         * }
         * 
         * }
         */

        /*
         * Panagram
         * String str = "Abcdefghijklmnoopqrstuvwxyz";
         * 
         * str.toLowerCase();
         * if (str.length() < 26) {
         * System.out.println("Not pana");
         * return;
         * } else {
         * boolean b=true;
         * for (char ch = 'a'; ch <= 'z'; ch++) {
         * if (str.indexOf(ch)<0) {
         * System.out.println("This is no panagram");
         * b=false;
         * return;
         * }
         * 
         * 
         * }
         * if(b==true){
         * System.out.println("Panagram");
         * }
         * 
         * }
         */

        /*
         * Reverse Word Space As it
         * String str="my name is santu";
         * char ch[]=str.toCharArray();
         * int lb=0,ub=ch.length-1;
         * while(lb<=ub){
         * if(ch[lb]==' '){
         * lb++;
         * }else if(ch[ub]==' '){
         * ub--;
         * }else{
         * char temp=ch[lb];
         * ch[lb]=ch[ub];
         * ch[ub]=temp;
         * lb++;
         * ub--;
         * }
         * }
         * 
         * System.out.println(String.valueOf(ch));
         */

        // Strin frequency
        /*
         * Strinstr = "saaanttuuu";
         * char str2[] g = str.toCharArray();
         * int size = str2.length;
         * int freq[] = new int[size];
         * 
         * for (int i = 0; i < size; i++) {
         * freq[i] = 1;
         * for (int j = i + 1; j < size; j++) {
         * 
         * if (str2[i] == str2[j]) {
         * freq[i]++;
         * str2[j] = 'o';
         * 
         * }
         * 
         * }
         * }
         * for(int i=0;i<size;i++){
         * if(freq[i]==' ' && str2[i]=='o'){
         * System.out.println(str2[i]+"=>"+freq[i]);
         * }
         * }
         */

        // Balenced String
        /* 
        boolean b=false;
        String str = "{[()}";
        char stack[] = new char[str.length()];
        int i = -1;
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack[++i] = ch;

            }else{
                if(i>=0 && ((stack[i]=='(' && ch==')')||(stack[i]=='{' && ch=='}')||(stack[i]=='[' && ch==']'))){
             i--;
             b=true;
           }else{
            b=false;
           }
        }
        }
        if(b==true){
            System.out.println("Balenced");
        }else{
            System.out.println("Not balenced");
        }
            */
    
   /*Longest Palindromuc sub string 

   String str="sann  ntu";
   int n=str.length();
   int max=1,start=0;
   for(int i=0;i<str.length();i++){
    for(int j=i;j<str.length();j++){
        boolean b=true;
        for(int k=0;k<(j-i+1)/2;k++)
            if(str.charAt(i+k)!=str.charAt(j-k))
                b=false;
            
                if(b && (j-i+1)>max){
                    start=i;
                    max=j-i+1;
                }

        }
    }
    System.out.println(str.substring(start, start*max));
   */
  /*Print all Sub String  
      String str="helelelo";
      for(int i=0;i<str.length();i++){
        for(int j=i+1;j<str.length();j++){
            System.out.println(str.substring(i, j));
        }
      } 
        */
   


        
}
    

}
