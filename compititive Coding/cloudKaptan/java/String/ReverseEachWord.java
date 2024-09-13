import java.util.Stack;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "santu Jana";
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                st.push(str.charAt(i));
            } else {
                while (st.empty() == false) {
                    System.out.print(st.pop());
                }
                System.out.print(" ");
            }
        }
        while (st.empty()==false) {
            System.out.print(st.pop());
        }
    }
}
