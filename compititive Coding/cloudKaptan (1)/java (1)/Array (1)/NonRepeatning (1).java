public class NonRepeatning {
    public static void main(String[] args) {
        int arr[]={1,1,1,1,2,5,4,4,5,7,9,2,3,12};

        for(int i=0;i<arr.length;i++){
            boolean bool=true;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j] && i!=j){
                    bool=false;
                }
            }
            if(bool==true){
                System.out.println(arr[i]);
            }
        }
    }
}
