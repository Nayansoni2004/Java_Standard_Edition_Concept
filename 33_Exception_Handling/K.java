class K {
    //main method
    public static void main(String[] args) {

        System.out.println("T");
        aaa();
        System.out.println("H");
    }    

    static void aaa() {
        System.out.println("S");
        bbb();
        System.out.println("J");
    }

    static void bbb() {
        System.out.println("K");
        ccc();
        System.out.println("Q");
    }

    static void ccc() throws ArithmeticException {
        int x = 12 / 0;
        System.out.println("R");
    }
}
/*OUTPUT:
T
S
K
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at K.ccc(K.java:23)
        at K.bbb(K.java:18)
        at K.aaa(K.java:12)
        at K.main(K.java:6)
 */