public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int s=17;
        int ft=0,ls=arr.length;
        int mid=(ft+ls)/2;

        while (ft<=ls) {
            if(arr[mid]>s){
       ls=mid-1;
            }else if(arr[mid]==s){
                System.out.println("found");
                return;
            }
            else{
                ft=mid+1;
            }
            mid=(ft+ls)/2;
        }
        if(ft>ls){
            System.out.println("not found n array");
        }
    }
}
