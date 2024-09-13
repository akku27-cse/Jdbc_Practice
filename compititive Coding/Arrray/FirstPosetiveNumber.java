public class FirstPosetiveNumber {
    public static void main(String[] args) {
        
        int arr[]={-2,-9,8,-7,1,2,-3,-8};
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                System.out.println(arr[i]);
                return;
            }
        }
    }
}
