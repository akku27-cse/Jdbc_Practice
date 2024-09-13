public class selectionSort {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 3, 1, 4 };
        int pos = 0;
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            pos = i;

            for (int j = i+1; j < arr.length; j++) {
                if (arr[pos]>  arr[j]) {
                    pos =j;

                }
               
            } 
            if (pos != i) {
                temp=arr[i];
                arr[i]=arr[pos];
                arr[pos]=temp;
             }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
