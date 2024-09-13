import java.util.Scanner;

public class ProductArray {


    
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       
       int product[]=new int[n];
       for(int i=0;i<arr.length;i++){
        int count=1;
        for(int j=0;j<arr.length;j++){
            if(i!=j){
                count=count*arr[j];
            }
        }
        product[i]=count;
       }
       for(int i=0;i<arr.length;i++)
System.out.print(product[i]+" ,");

    }
}
