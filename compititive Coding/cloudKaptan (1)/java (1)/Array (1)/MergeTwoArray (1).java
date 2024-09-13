public class MergeTwoArray {
    

    public static void main(String[] args) {
        

        int arr[]={1,2,3};
        int arr2[]={3,4,5,6};
        int a=arr.length;
        int b=arr2.length;
        int c=a+b;
        int arr3[]=new int[c];
        for(int i=0;i<arr.length;i++){
            arr3[i]=arr[i];
        }
        for(int i=0;i<arr2.length;i++){
            arr3[a+i]=arr2[i];

        }
        int temp;
        for(int i=1;i<arr3.length;i++){
            for(int j=0;j<arr3.length-1;j++){
                if(arr3[j]>arr3[j+1]){
                    temp=arr3[j+1];
                    arr3[j+1]=arr3[j];
                    arr3[j]=temp;
                }
            }
        }
    for(int i=0;i<arr3.length;i++)
    System.out.print("["+arr3[i]+","+"]");
    }
}
