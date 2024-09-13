/*
 **** 
 *** 
 ** 
 *
 */

public class ThirdPAttern {
   public static void main(String[] args) {
    int n=4;
    for(int i=1;i<=n;i++){
        for(int j=i;j<n;j++){
            System.out.print("*");
        }
        System.out.println("*");
    }
    System.out.println(" ");
    for(int i=1;i<=n;i++){
        for(int j=i;j<=n;j++){
            System.out.print(j);
        }
        System.out.println(" ");
    }
   }
}
