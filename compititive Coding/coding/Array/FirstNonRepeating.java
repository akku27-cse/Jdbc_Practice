public class FirstNonRepeating {
    public static void main(String[] args) {

        int arr[] = { 4, 5 };

        for (int i = 0; i < arr.length; i++) {
            boolean bool = false;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    bool = true;
                    System.out.println(arr[i]);
                    break;
                }
                break;
            }
            if (bool == false)
                System.out.println(arr[i]);
            break;
        }
    }
}
