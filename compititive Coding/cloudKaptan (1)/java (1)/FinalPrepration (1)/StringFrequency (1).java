public class StringFrequency {
    
public static void main(String[] args) {
    

    String str="my name is santu jana";
    int size=26;
    int freq[]=new int[size];
     char ch[]=str.toCharArray();
     
     for(int i=0;i<str.length();i++){
     freq[i]=1;
     for(int j=i+1;j<str.length();j++){
        if(ch[i]==ch[j]){
            freq[i]++;

            ch[j]='O';
        }
     }
     }
     for(int i=0;i<freq.length;i++){
        if(freq[i]!=' '&& ch[i]!='O' )
        System.out.println(ch[i]+"-"+freq[i]);
     }
}
}
