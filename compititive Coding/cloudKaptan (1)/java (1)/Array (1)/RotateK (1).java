public class RotateK {
 
    

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
         int k=3;

        int n=arr.length;
        
          

    for(int i=0;i<k;i++){
        int last;
        last=arr[arr.length-1];
        for(int j=arr.length-1;j>0;--j){
            arr[j]=arr[j-1];

        }
        arr[0]=last;
    }

    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
    

    }
}
