public class RemoveDuplicate {
    

    public static void main(String[] args) {
        

        int arr[]={1,1,1,2,3,3,4,4,5};
        int n=arr.length;
        int tempArr[]=new int[n];
int j=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
            tempArr[j++]=arr[i];
        }
    }
    
        tempArr[j++]=arr[n-1];
        for(int i=0;i<j;i++){
            arr[i]=tempArr[i];
        }

        for(int i=0;i<j;i++){
            System.out.println(arr[i]);
        }
    }
}
