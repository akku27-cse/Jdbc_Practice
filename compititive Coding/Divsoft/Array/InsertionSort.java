public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 5, 3, 1, 4, 2 };
        int temp, j=0;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            j = i - 1;
            while (temp < arr[j] && j >= 0) {
                arr[j + 1] = arr[j];
                j = j - 1;

            }
            arr[j + 1] = temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
