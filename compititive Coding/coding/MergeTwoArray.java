/**
 * MergeTwoArray
 */
public class MergeTwoArray {

    public static void main(String[] args) {
        int arr[]={1,2,4};
        int arr2[]={3,4,6};


        int finalArray[]=new int[arr.length+arr2.length];

        for(int i=0;i<arr.length;i++){
            finalArray[i]=arr[i];
        }
        for(int i=0;i<arr2.length;i++){
            finalArray[arr.length+i]=arr2[i];
        }
        //print 
        for(int i=0;i<finalArray.length;i++){
            System.out.println(finalArray[i]);
        }
        //soting
        for(int i=0;i<finalArray.length-1;i++){
            if(finalArray[i]>finalArray[i+1]){
                int temp=finalArray[i];
                finalArray[i]=finalArray[i+1];
                finalArray[i+1]=temp;
                i=-1;
            }
        }
        System.out.println("After sorting");
        for(int i=0;i<finalArray.length;i++){
            System.out.println(finalArray[i]);
        }

    }
}