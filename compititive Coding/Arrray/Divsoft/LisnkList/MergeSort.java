public class MergeSort {

    public static void conquer(int arr[], int st, int mid, int en) {

        int merged[] = new int[en - st + 1];
        int indx1 = st;
        int indx2 = mid + 1;
        int x = 0;
        while (indx1 <= mid && indx2 <= en) {
            if (arr[indx1] <= arr[indx2]) {
                merged[x++] = arr[indx1++];
            } else {
                merged[x++] = arr[indx2++];
            }
        }
        while (indx1 <= mid) {
            merged[x++] = arr[indx1++];
        }
        while (indx2 <= en) {
            merged[x++] = arr[indx2++];
        }
        //copy in original array
        for(int i=0,j=st;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }

    }

    public static void divide(int arr[], int st, int en) {

        if (st >= en) {
            return;
        }

        int mid = (st + en) / 2;
        divide(arr, st, mid);
        divide(arr, mid + 1, en);
        conquer(arr, st, mid, en);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 3, 2, 4 };
        int n = arr.length;
        divide(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
