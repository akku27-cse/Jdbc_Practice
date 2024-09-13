//  import java.util.*;
// // class FirstThreadClass extends Thread{
// //     public static void main(String[] args) {
        
// //         Thread t1=new Thread();
// //         t1.start();
// //         System.out.println("Thraed is created");
// //     }
// // }

// /**
//  * FirstThreadClass
//  */
// class FirstThreadClass implements Runnable{
//     public void run(){
//         System.out.println("Thradc is running ");
//     }
// public static void main(String[] args) {
//     FirstThreadClass t2=new FirstThreadClass();
//     Thread t1=new Thread();
//     t2.run();
// }
    
// }

/**
 * FirstThreadClass
 */
public class FirstThreadClass extends Thread {
public static void main(String[] args) {
    Thread t1=new Thread();
    t1.start();
    Thread t2=new Thread();
    t2.start();
    //sleep
    try {
        for(int i=0;i<10;i++){
            
            System.out.println(i);
            t1.sleep(1000);

        }

    } catch (Exception e) {
        // TODO: handle exception
    }
    try {
        for(int j=12;j>=0;--j){
            System.out.println(j);
            t2.sleep(500);
        }
    } catch (Exception e) {
        // TODO: handle exception
    }

}
    
}