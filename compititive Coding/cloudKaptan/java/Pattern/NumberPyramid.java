/*
 
          1
        2   2
     3   3    3
   4   4   4    4
 */

public class NumberPyramid {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
         for(int j=1;j<=5;j++){
            if((i+j)>=6){
                System.out.print(i);
            }else
            System.out.print(" ");

        }
        System.out.println(  );
        }
    }
}
