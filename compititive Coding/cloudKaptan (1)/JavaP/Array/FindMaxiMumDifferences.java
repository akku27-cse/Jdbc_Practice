/**
 * FindMaxiMumDifferences
 */
public class FindMaxiMumDifferences {

    public static void main(String[] args) {
        int arr[]={1,7,8,6,3,2,3,4,5,10,11,-12};
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("maximum differences="+(arr[arr.length-1]-arr[0]));
    }
}