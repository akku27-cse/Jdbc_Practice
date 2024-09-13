public class MergeSort {
    
public static void Divide(int arr[],int si,int ei){
if(si>=ei){
    return;
}
int mid=(ei+si)/2;
Divide(arr, si, mid);
Divide(arr,mid+1, ei);
Conquere(arr,si,mid,ei);
}
public static void Conquere(int arr[],int si,int mid,int ei)
{
    int merged[]=new int[ei-si+1];

    int indx1=si;
    int indx2=mid+1;
    int indx=0;
    while (indx1<mid && indx2<=ei) {
        if(arr[indx1]<=arr[indx2]){
            merged[indx++]=arr[indx1++];
        }else{
            merged[indx++]=arr[indx2++];
        }
        
    }
    while (indx1<=mid) {
        merged[indx++]=arr[indx1++];
    }
    while (indx2<=ei) {
        merged[indx++]=arr[indx2++];
    }

    for(int i=0,j=si;i<merged.length;i++){
        arr[j]=merged[i];
    }
}
    

    public static void main(String[] args) {
        int arr[]={1,4,3,0,7,2,6};
        int n=arr.length;
     Divide(arr, 0, n-1);
       for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
       }    
    }
}
