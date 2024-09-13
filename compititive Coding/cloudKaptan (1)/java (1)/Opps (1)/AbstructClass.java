    /**
     * AbstructClass
     */
    public class AbstructClass {

        public static void main(String[] args) {
            easy2 a = new easy2();
            a.d();
            a.c();
            a.d();
        }
    }

    class easy {

        void c() {
            System.out.println("santu");
        }
        
    }

    class easy2 extends easy {

        void d() {
            System.out.println("jana");
            super.c();
        }

    }