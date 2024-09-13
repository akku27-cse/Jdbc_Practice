public class RotateByK {
    public static void main(String[] args) {
        

        int k=3;
        int arr[]={1,3,2,5,4};
        
        for(int i=1;i<=k;i++){
            int last=arr[arr.length-1];
            for(int j=arr.length-1;j>0;--j){
                arr[j]=arr[j-1];
            }
            arr[0]=last;
        }
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }
}
