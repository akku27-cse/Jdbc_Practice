public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int search=51;
        int mid=(0+arr.length)/2;
        int lb=0,ub=arr.length;
        int u=0;
        while (lb<=ub) {
            if(arr[mid]>search){
                lb=mid+1;
            }else if(arr[mid]==search){
                System.out.println("Found");
                u++;
                break;

            }else
            ub=mid-1;
            mid=(ub+lb)/2;
        }
if(u==0){
    System.out.println("Not found ");
}
    }
}
