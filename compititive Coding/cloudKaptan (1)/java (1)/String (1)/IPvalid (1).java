public class IPvalid {
    
    public static void main(String[] args) {
        String str="127.19.14.147";
        String str2[]=str.split("\\.");

        if(str2.length!=4){
            System.out.println("This is not  valid ip address");
            return;
        }else{
            for(String part:str2){
                try {
                    int number=Integer.parseInt(part);
                    if(number>255 || number<0){
                     System.out.println("This is Invalid Ip");   
                    }
                } catch (Exception e) {
                    System.out.println(e);
                    // TODO: handle exception
                }
            }
            System.out.println("valid Ip");
        }
    }
}
