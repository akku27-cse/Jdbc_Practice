class Reverse {
    public static void main(String[] args) {

        String str = "my name";

        int n = str.length();
        int fa = 0, lb = n - 1;
        char ch[] = str.toCharArray();

        while (fa <= lb) {
            if (ch[fa] == ' ') {
                fa++;
                continue;
            } else if (ch[lb] == ' ') {
                lb--;
                continue;
            } else {
                char temp = ch[fa];
                ch[fa] = ch[lb];
                ch[lb] = temp;
                fa++;
                lb--;
            }
        }
        System.out.println(str.valueOf(ch));
    }
}