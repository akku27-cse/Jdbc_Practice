public class NonReapeating {
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            boolean bol=true;
            for(int j=0;j<arr.length;j++){
                if(i!=j&& arr[i]==arr[j]){
                    bol=false;
                }
            }
            if(bol==true){
                System.out.println(arr[i]);
            }
        }
    }
}
