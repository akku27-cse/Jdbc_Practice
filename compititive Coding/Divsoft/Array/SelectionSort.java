public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 3, 9, 2, 4, 7 };
        int pos, temp;
        for (int i = 0; i < arr.length; i++) {
            pos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[pos] > arr[j]) {
                    pos = j;
                }
                
            }
            if (pos != i) {
                    temp = arr[i];
                    arr[i] = arr[pos];
                    arr[pos] = temp;
                
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
