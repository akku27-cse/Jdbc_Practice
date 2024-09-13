import java.util.Arrays;

/**
 * Frequency
 */
public class Frequency {

    
    public static void main(String[] args) {
        
        int arr[]={1,2,2,1,3,4,5,1,3};


        Arrays.sort(arr);

        int n=arr.length-1;
        int arr2[]=new int[n];
        for(int i=0;i<n;i++){
            arr2[i]=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    arr2[i]++;
                    arr2[j]=0;
                }
            }
            for(int k=0;i<n;i++)
            {
                if(arr[k]==0){
                    System.out.println(arr[k]+"=>"+arr2[k]);
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0){
                System.out.println(arr[i]+"=>"+arr2[i]);
            }
        }
    }
}