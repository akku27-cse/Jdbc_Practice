public class Quicksort {
public static int partiton(int arr[],int low,int high){
int pivot=arr[high];
int i =low-1;
for(int j=low;j<high;j++){
    if(arr[j]<pivot){
        i++;
        //swap
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
i++;
int temp=arr[i];
arr[i]=pivot;
arr[high]=temp;
return i;

}    

    public static void Quick(int arr[],int low,int high){
if(low<high){
    int pivot=partiton(arr,low,high);
    Quick(arr,low,pivot-1);
    Quick(arr,pivot+1,high);

}

}
    public static void main(String[] args) {
        int arr[]={4,3,5,1,2,9,7};
        int n=arr.length;
         Quick(arr,0,n-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
