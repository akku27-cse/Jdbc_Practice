import java.util.Arrays;

public class Anaram {
    public static void main(String[] args) {
        String str="santu";
        String str2="santuuuuu";
        char ch1[]=str.toCharArray();
        char ch2[]=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(str.length()!=str2.length()){
            System.out.println("Not anagram");
            return;
        }else{
          if(Arrays.equals(ch1, ch2)){
            System.out.println("Anagram");
          }else{
            System.out.println("Not Anagram");
          }
        }
    }
}
