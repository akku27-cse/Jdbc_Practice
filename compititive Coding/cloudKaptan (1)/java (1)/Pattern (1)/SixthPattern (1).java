/*
 1
 01
 101
 0101
 10101
 */

public class SixthPattern {
    public static void main(String[] args) {
        int n=5;
        int p=0,f=1;
        for(int i=0;i<n;i++){



            if(i%2==0){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
}
