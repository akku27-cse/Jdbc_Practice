/**
 * LinearSearch
 */
public class LinearSearch {

    public static boolean lSearch(int arr[], int target) {
        boolean bool = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                bool = true;
            }
        }

        return bool;
    }

    public static void main(String[] args) {

        int arr[] = { 5, 9, 3, 6, 7, 1 };
        int target = 61;
        boolean result = lSearch(arr, target);
        if (result == true) {
            System.out.println("found");
        } else {
            System.out.println("Not Found");
        }
    }

}