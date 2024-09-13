public class FindMissingNumber {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,7};
        int sum=0;
        int n=7;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(((n*(n+1))/2)-sum);
    }
}
