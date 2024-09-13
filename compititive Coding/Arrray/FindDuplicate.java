import java.util.Arrays;

public class FindDuplicate {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 3, 4, 1, 2, 1, 2};
        
        // Sort the array
        Arrays.sort(arr);
        
        System.out.println("Duplicate elements are:");
        // Traverse the sorted array and find duplicates
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println(arr[i]);
                // Skip the next element to avoid printing it multiple times
                while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                    i++;
                }
            }
        }
    }
}
