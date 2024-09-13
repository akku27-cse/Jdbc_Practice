//package LastFinal;

public class SpaceAsitis {
    public static void main(String[] args) {
        String str = "Santu jana";
        char[] ch = str.toCharArray();
        int st = 0, last = str.length() - 1;
        char temp;
        while (st <= last) {
            if (ch[st] == ' ') {
                st++;
            } else if (ch[last] == ' ') {
                last--;
            } else {
                temp = ch[st];
                ch[st] = ch[last];
                ch[last] = temp;
                st++;
                last--;
            }
        }
        System.out.println(String.valueOf(ch));
    }
}
