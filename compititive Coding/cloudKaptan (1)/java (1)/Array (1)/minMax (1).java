import java.util.Scanner;

public class minMax {
    
    public static void main(String[] args) {
          Scanner  sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int temp;
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }


        System.out.println("Mini mum VAlue is="+arr[0]);
        for(int i=arr.length-1;i>=0;--i){
            if(arr[i]!=arr[i-1]){
                System.out.println("Second maximum value="+arr[i-1]);
                break;
            }

        }
    System.out.println(arr[arr.length-1]+"is the maxi mum number");
    }
}
