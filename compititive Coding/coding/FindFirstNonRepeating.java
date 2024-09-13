public class FindFirstNonRepeating {
    public static void main(String[] args) {
        

        int arr[]={3,3,3,3,3,34,34,34,9};
        for(int i=0;i<arr.length;i++){
            boolean boll=true;
            for(int j=i;j<arr.length;j++){
                if(arr[i]!=arr[j] && i!=j){
                  boll=false;
                  break;
                }
            }
            if(boll==true){
                System.out.println(arr[i]);
            }
        }
    }
}
