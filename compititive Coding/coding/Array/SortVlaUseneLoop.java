/**
 * SortVlaUseneLoop
 */
public class SortVlaUseneLoop {

      

    public static void main(String[] args) {
        
        int arr[]={10,2,8,1,3,9,4,7,3};

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                i=-1;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}