public class LongestCommonPrefix {
    static int max(int x, int y) {
        return (x > y) ? x : y;
    }

    static int lsp(char ch[], int i, int j) {

        if (i == j) {
            return 1;
        } else if (ch[i] == ch[j] && i + 1 == j) {
            return 2;
        }

        else if (ch[i] == ch[j]) {
            return lsp(ch, i + 1, j - 1) + 2;
        }

        return max(lsp(ch, i, j - 1), lsp(ch, i + 1, j));
    }

    public static void main(String[] args) {
        String str = "GEEKSFORGEEKS";
        int n = str.length();
        System.out.println(lsp(str.toCharArray(), 0, n - 1));
    }
}
