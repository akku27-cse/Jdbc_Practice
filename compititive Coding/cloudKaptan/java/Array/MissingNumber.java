public class MissingNumber {

    public static void main(String[] args) {
        int arr[]={1,2,3,5,6};
        int n=arr.length;
        int sum=((n)*(n+1))/2,result=0;
        for(int i=0;i<n;i++ ){
        result=result+arr[i];

        }
    System.out.println(result-sum);
    }
}