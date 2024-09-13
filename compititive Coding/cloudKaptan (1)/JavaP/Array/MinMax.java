public class MinMax {
    


    public static void main(String[] args) {
    int arr[]={7,3,6,9,1,0};
    for(int i=1;i<arr.length;i++){
        for(int j=0;j<arr.length-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
            }
        }
    }
    System.out.println("min vallue="+arr[0]);
    System.out.println("max value="+arr[arr.length-1]);
    
    for(int i=arr.length-1;i>=0;--i){
        if(arr[i]!=arr[i-1]){
            System.out.println("second maximum value="+arr[i-1]);
            break;
        }
    }
    }
}
