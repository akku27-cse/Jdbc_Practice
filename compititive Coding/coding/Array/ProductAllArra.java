public class ProductAllArra {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4 };
        int arr2[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int p = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    p = p * arr[j];
                }
            }

            arr2[i] = p;
        }

        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }

    }
}
