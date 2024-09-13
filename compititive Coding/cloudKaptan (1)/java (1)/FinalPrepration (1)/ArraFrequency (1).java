public class ArraFrequency {
    
    public static void main(String[] args) {
        
        int arr[]={1,1,1,5,4,5,4,5,4,4,9,20};
        int n=arr.length;


        int count[]=new int[n];

        for(int i=0;i<arr.length;i++){
            count[i]=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count[i]++;
                    arr[j]=0;
                }
            }
        }
    for(int i=0;i<count.length;i++){
        if(arr[i]!=0){
            System.out.println(arr[i]+"-repeated "+count[i]);
        }
    }
    }
}
