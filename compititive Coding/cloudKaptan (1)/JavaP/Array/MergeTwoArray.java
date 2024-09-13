public class MergeTwoArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int arr2[]={4,5,6,7};

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
        for(int i=0;i<arr3.length;i++){
           System.out.print(+arr3[i]+",");
        }
    }
}
