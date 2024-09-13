public class FindThePairsofSum {
    
    public static void main(String[] args) {
        int arr[]={1,4,5,6,7,8,3};
        int dum=7;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==dum){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
