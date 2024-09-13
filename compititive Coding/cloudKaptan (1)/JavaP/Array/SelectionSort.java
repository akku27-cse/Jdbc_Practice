public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={4,3,2,7,1,0};
        for(int i=0;i<arr.length;i++){
            int pos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[pos]>arr[j]){
                    pos=j;
                }
            }
            if(i!=pos){
            int temp=arr[i];
            arr[i]=arr[pos];
            arr[pos]=temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
