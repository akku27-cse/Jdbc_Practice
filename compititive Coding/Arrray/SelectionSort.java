public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 3, 1, 2, 4, 6, 9, 7 };

        for (int i = 0; i < arr.length  ; i++) {
            int pos = i;
            for (int j = i + 1; j < arr.length; i++) {
                if (arr[pos] > arr[j]) {
                    pos = j;
                }
            }
            if (pos != i) {
                int temp = arr[pos];
                arr[pos] = arr[i];
                arr[i] = temp;
            }
        }
          for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
          }
    }
}
