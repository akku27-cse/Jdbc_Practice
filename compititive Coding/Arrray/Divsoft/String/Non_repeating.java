public class Non_repeating {

    public static void main(String[] args) {
        String str = "aabbccd";

        for (int i = 0; i < str.length(); i++) {

            boolean bool =false;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && i != j) {
                    bool = true;
                   break;
                }

            }
            if(!bool){
                System.out.println(str.charAt(i));

            }

        }
    }
}