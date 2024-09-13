public class Frequency {
    
    public static void main(String[] args) {
        int arr[]={1,1,1,1,1,1,3,3,3,2,2,2,5,5,7,5,7};
        int arr2[]=new int[100];

        for(int i=0;i<arr.length;i++){
            arr2[i]=1;

            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                 arr2[i]++;
                 arr[j]=0;
                }
            }
        }
        for(int i=0;i<arr2.length-1;i++){
            if(arr[i]!=0){
                System.out.println(arr[i]+"="+arr2[i]);
            }
        }
    }
}
