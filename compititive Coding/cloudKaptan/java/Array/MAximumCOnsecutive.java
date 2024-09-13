public class MAximumCOnsecutive {
    public static void main(String[] args) {
        

        int arr[]={1,1,0,1,1,1,1,1,0,0,1};
        int count=0;
        int prevCount=0;    
        for(int i=0;i<arr.length;i++){


            if(arr[i]==1){
            count=count+1;    
            }else{
                if(count>prevCount){
                    prevCount=count;
                    count=0;
                }
              
            }
           
        }
        System.out.println(prevCount);
    }
}
