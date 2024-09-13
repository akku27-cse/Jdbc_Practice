/**
 * LargestNegstiveNumber
 */
public class LargestNegstiveNumber {

    public static void main(String[] args) {
        

        int arr[]={-2,-4,-1,0,1,2,-5};
        int result=0;
        boolean b=false;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                if(!b){
                    result=arr[i];
                    b=true;
                }else if(arr[i]>result){
                    result=arr[i];
                }
            }
        }
        System.out.println(result);
    }
}