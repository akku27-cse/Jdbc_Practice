
/**
 * LinearSearch
 */
public class LinearSearch {

    public static boolean Search(int[] arr) {
        int target = 9;
        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] a) {
        int arr[] = { 1, 2, 3 };
        boolean bol = Search(arr);
        if (bol) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }  
    }
}