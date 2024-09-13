public class ProductofArray {
    
public static int Product(int arr[],int left,int right){

    if(left==right){
        return arr[left];
    }
    int mid=(left+right)/2;
    int productLeft=Product(arr, left, mid);
    int productRight=Product(arr, mid+1, right);
    return productLeft*productRight;
}

    public static void main(String[] args) {
        int arr[]={4,5,6};
        int left=0,right=arr.length-1;
        System.out.println(Product(arr, left, right));


    }
}
