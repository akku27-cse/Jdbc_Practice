public class PAttern3 {
    public static void main(String[] args) {
        for(int i=1;i<=6;i++){
            for(int j=6;j>=1;j--){
                if(i<=j){
                    System.out.print("* ");
    
                }
                else{
                    System.out.print(" ");
                }
            
            }
            System.out.println(" ");
        }
        /*
         * 
         **
         ***
         **** 
         */
        for(int i=6;i>=1;i--){
            for(int j=6;j>=1;j--){
                if(i<=j){
                    System.out.print("* ");
    
                }
                else{
                    System.out.print(" ");
                }
            
            }
            System.out.println(" ");
        }
    }
}
