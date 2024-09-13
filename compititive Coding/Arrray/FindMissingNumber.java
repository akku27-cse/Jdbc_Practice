public class FindMissingNumber {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 4, 5, 6, 7 };
        int n = 7;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result + arr[i];
        }
        System.out.println("missing number is "+((n*(n+1)/2)-result));
    }
}
