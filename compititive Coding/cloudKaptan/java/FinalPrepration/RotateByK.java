public class RotateByK {
    public static void main(String[] args) {
        
    
    int k=3;
    int arr[]={1,2,3,4,5,6,7,8,9};

    for(int i=0;i<k;i++){
        int last;
        last=arr[arr.length-1];
        for(int j=arr.length-1;j>0;j--){
            arr[j]=arr[j-1];

        }
        arr[0]=last;
    }
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
}
}