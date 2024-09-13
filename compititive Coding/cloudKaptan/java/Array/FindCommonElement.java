public class FindCommonElement {

    

    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int arr2[]={3,4,5,6};

        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j] && arr[i]!=arr[i-1]){
                count=arr[i];
                }

            }
            System.out.println(count);
            break;
        }



    }
}
