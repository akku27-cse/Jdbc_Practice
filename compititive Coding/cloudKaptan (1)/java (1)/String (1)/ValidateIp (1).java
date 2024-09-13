public class ValidateIp {
    public static void main(String[] args) {
        
        String str="122.21.1.5.73";


        String[] parts=str.split("\\.");
        if(parts.length!=4){
            System.out.println("This is not a valid Ip address");
            return;
        }else{
            for(String part:parts){
                try {
                    int num=Integer.parseInt(part);
                    if(num<0 || num>255){
                        System.out.println("Invalid");
                        return;
                    }
                } catch (Exception e) {  
                    // TODO: handle exception
                    System.out.println(e);
                    return;
                }
            }
            System.out.println("this is validIp");
        }
    }
}
