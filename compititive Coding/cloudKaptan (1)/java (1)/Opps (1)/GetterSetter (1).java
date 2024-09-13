public class GetterSetter {
    private int n;
    void setNumber(int N){
        this.n=N;
    }
    int getNumber(){
        return n;
    }
    int y=9;
    int z=n+y;
    public static void main(String[] args) {
     GetterSetter g=new GetterSetter();
     g.setNumber(90);
     System.out.println(g.getNumber());        
System.out.println(g.z);
    }
}
