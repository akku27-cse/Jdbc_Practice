/*
 * 
 * 
1 1 1 1 1 1  
 2 2 2 2 2  
  3 3 3 3  
   4 4 4  
    5 5  
     6  
 */
public class Pattern4 {
    public static void main(String[] args) {
        /*
     *         
    * *  
   * * *  
  * * * *  
 * * * * *  
* * * * * *   */
       
        for(int i=6;i>=1;--i){
            for(int j=1;j<=6;j++){
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
   * * * * * *  
 * * * * *  
  * * * *  
   * * *  
    * *  
     *  
         */
        for(int i=1;i<=6;i++){
            for(int j=1;j<=6;j++){
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

//
/*
     *  
    * *  
   * * *  
  * * * *  
 * * * * *  
* * * * * *  
* * * * * *  
 * * * * *  
  * * * *  
   * * *  
    * *  
     *  
 */