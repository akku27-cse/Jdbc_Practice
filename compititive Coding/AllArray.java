import java.util.Arrays;

public class AllArray {
    public static void main(String[] args) {
        
        /*Delete Duplicate Array 
        int arr[]={1,1,1,1,2,2,2,3,1,3,1,3,5};

        int tempArr[]=new int[arr.length];
        int j=0;
         Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                tempArr[j++]=arr[i];
            }
        }//for last value enter
        tempArr[j++]=arr[arr.length-1];
//modify the temp array
         for(int i=0;i<j;i++){
            arr[i]=tempArr[i];
         }
         for(int i=0;i<j;i++){
            System.out.println(arr[i]);
         }
            */
    
        /*Maximum Consucutive 
        int arr[]={0,0,0,0,0,1,1,1,10,1,1,10,1,1,1,1,1,1,1,1,0};
        int count =0;
        int value=0;
        int prevCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count=count +1;

            }else if(count>prevCount){
                prevCount=count;
               
                count =0;
            }
        }
        System.out.println(value+"=>"+prevCount);
        */
        
    
    
    
    }
}
