public class BinarySearch {
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5,6};

        int lb=0,ub=arr.length;
int search=7;
int cont=0;
        int mid=ub/2;
        while (lb<=ub) {

          if(arr[mid]<search){
            ub=mid-1;

          }else if(arr[mid]==search){
            System.out.println("found");
           cont++;
            break;
          }else{
            lb=mid+1;
          }
          mid=(lb+ub)/2;
            
        }
        if(cont==0){
            System.out.println("Not Found");
        }
    }
}
