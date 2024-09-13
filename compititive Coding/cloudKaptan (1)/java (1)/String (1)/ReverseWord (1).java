//reverse word but sapce are remaining same pos
public class ReverseWord {

    public static void main(String[] args) {

        String str = "Please God";

        int n = str.length();
        int strat = 0, end = n - 1;
        char[] ch = str.toCharArray();
        char temp;
        // main approach
        while (strat < end) {
            if (ch[strat] == ' ') {
                strat++;
                continue;
            } else if (ch[end] == ' ') {
                end--;
                continue;

            } else {
                temp = ch[strat];
                ch[strat] = ch[end];
                ch[end] = temp;
                strat++;
                end--;

            }
           
        }
        System.out.println(String.valueOf(ch));
    }
}