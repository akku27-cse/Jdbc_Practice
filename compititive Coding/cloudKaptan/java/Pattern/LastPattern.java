public class LastPattern {
    public static void main(String[] args) {
        
        for(int i=0;i<5;i++){
            for(int j=5;j>=0;j--){
                if((i+j)>=6){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    
    }
}
