import java.util.Arrays;

/**
 * NumberOFVowelAndConst
 */
public class NumberOFVowelAndConst {
    public static void CountVowelANdCOnst(String str) {
        int count = 0;
        int consta = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'I' || ch == 'o' || ch == 'i' || ch == 'O'
                    || ch == 'U' || ch == 'u') {
                count++;
            } else if (ch == ' ') {

            } else {
                consta++;
            }
        }
        System.out.println("Number of vowel=" + count);
        System.out.println("number of constent=" + consta);

    }

    // Frequncy
    public static void frequecyOfString(String str) {

        int size = 26;
        char ch[] = str.toCharArray();
        int temp[] = new int[size];

        for (int i = 0; i < str.length(); i++) {
            temp[i] = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (ch[i] == ch[j]) {
                    temp[i]++;
                    ch[j] = 'O';
                }
            }
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != ' ' && ch[i] != 'O' && ch[i] != ' ') {
                System.out.println(ch[i] + "=" + temp[i]);
            }
        }
    }

    // print decending order
    public static void prntDecendingOrder(String str) {
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        for (int i = ch.length - 1; i >= 0; --i) {
            System.out.print(ch[i]);
        }
    }

    // ReverseWord Sapce asit
    public static void ReverseWordSpaceAsit(String str) {
        int start = 0, last = str.length() - 1;
        char ch[] = str.toCharArray();
        while (start <= last) {
            if (ch[start] == ' ') {
                start++;

            } else if (ch[last] == ' ') {
                last--;
                ;
            } else {
                char temp = ch[start];
                ch[start] = ch[last];
                ch[last] = temp;
                start++;
                last--;
            }
        }
        System.out.println(str.valueOf(ch));
    }

    // print all substring
    public static void PrintAllSubString(char str[]) {

        int n = str.length;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                int m = j + i - 1;
                for (int k = 0; k <= m; k++) {
                    System.out.println(str[k]);
                }

            }
            System.out.println();
        }

    }

    // Print dum of two string
    public static void SumOfTwoString(String str1, String str2) {
        int result = Integer.parseInt(str1) + Integer.parseInt(str2);
        System.out.println(result);
    }

    // remove SpecialSymbol
    public static void RemoveSpecaialSymbol(String str) {
        String stringResult = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 64 && str.charAt(i) <= 122) {
                stringResult = str.charAt(i) + stringResult;
            }
        }
        System.out.println(stringResult);
    }
//Valid Ip
    public static void IpAddressCheck(String str) {

        String parts[] = str.split("\\.");
        if (parts.length != 4) {
            System.out.println("Ip is Not Valid");
            return;
        } else {
            for (String part : parts) {
                try {
                    int num = Integer.parseInt(part);
                    if (num < 0|| num > 255) {
                        System.out.println("Invalid");
                    }
                } catch (Exception e) {
                    // TODO: handle exception
                    System.out.println(e);
                    return;
                }
            }
            System.out.println("valid Ip");
        }

    }
//BAlenced Parenthees
public static boolean BAlencedParenthees(String str){
    int i=-1;
    boolean bool=false;
    char ch[]=new char[str.length()] ;
    for(char c:str.toCharArray()){
        if(c=='(' || c=='{'||c=='['){
            ch[++i]=c;
        }else if(i>0 && ch[i]=='(' && c==')' || ch[i]=='{' || c=='}' || ch[i]=='[' && c==']'){
            i--;

        }else{
            return false;
        }
    }
    return i==-1;
    
}


//RomanTO Integer
public static int RomanToInt(String s){
  
        int ans = 0;
        int[] roman = new int[128];
    
        roman['I'] = 1;
        roman['V'] = 5;
        roman['X'] = 10;
        roman['L'] = 50;
        roman['C'] = 100;
        roman['D'] = 500;
        roman['M'] = 1000;
    
        for (int i = 0; i + 1 < s.length(); ++i)
          if (roman[s.charAt(i)] < roman[s.charAt(i + 1)])
            ans -= roman[s.charAt(i)];
          else
            ans += roman[s.charAt(i)];
    
        return ans + roman[s.charAt(s.length() - 1)]; 
      
}
//int to Roman
public String intToRoman(int num) {
    
    
            final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final String[] symbols = {"M",  "CM", "D",  "CD", "C",  "XC", "L",
                                  "XL", "X",  "IX", "V",  "IV", "I"};
        StringBuilder sb = new StringBuilder();
    
        for (int i = 0; i < values.length; ++i) {
          if (num == 0)
            break;
          while (num >= values[i]) {
            num -= values[i];
            sb.append(symbols[i]);
          }
        }
    
        return sb.toString();
    
        }
//longestpalindrome

public static void main(String[] args) {
//char str[]={'a','b','c'};
      //  String str = "my name is santu jana";
        //CountVowelANdCOnst(str);
       // frequecyOfString(str);
       // prntDecendingOrder(str);
      // ReverseWordSpaceAsit(str);
  //    PrintAllSubString(str);
//   String str1="111";
//   String str2="333";
//   SumOfTwoString(str1, str2);
    
// String str="my name is @santu &java";
// RemoveSpecaialSymbol(str);
//String str="121.122.22.23";   
//IpAddressCheck(str);
// String str="{([])}";
// boolean bool=BAlencedParenthees(str);
// if(bool==true){
//     System.out.println("Parenthees BAlenced");
// }else{
//     System.out.println("Parenthees Not BAlenced");
// }
}
}