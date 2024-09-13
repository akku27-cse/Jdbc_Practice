public class LargestNegetiveNumber {
    public static void main(String[] args) {

        int arr[] = { -4, -3, -2, -1, 0, 1, 2, 3 };
        boolean bool = false;
        int large = 0;
        for (int n : arr) {
            if (n < 0) {
                if (!bool) {
                    large = n;
                    bool = true;
                } else if (n > large) {
                    large = n;
                }
            }
        }

        System.out.println(large);

    }
}
