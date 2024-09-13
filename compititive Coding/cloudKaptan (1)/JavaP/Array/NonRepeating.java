public class NonRepeating {
    public static void main(String[] args) {
        int arr[]={1,1,1,1,2,2,2,3,4};
        for(int i=0;i<arr.length;i++){
            boolean bool=true;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==arr[i] && i!=j){
                    bool=false;
                }
            }
            if(bool==true){
                System.out.println(arr[i]);

            }
        }
    }
}
