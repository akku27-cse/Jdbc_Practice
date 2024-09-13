public class plusOne {
    public static void main(String[] args) {

        int arr[] = { 9, 9, 9 };
        int i = arr.length - 1;

        while (i <= 0) {
            if (arr[i] != 9) {
                arr[i] = arr[i] + 1;
                // for(int j=0;i<arr.length;i++){
                // System.out.println(arr[j]);

                // }
                // break;
            } else {
                arr[i] = 0;
                i--;
            }
        }

        int Temp[] = new int[arr.length + 1];
        Temp[0] = 1;
        int a = Temp.length;
        for (i = 0; i < arr.length; i++) {
            Temp[a + i] = arr[i];
        }
        for (i = 0; i < Temp.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
