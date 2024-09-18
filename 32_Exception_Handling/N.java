class N {
    //main method
    public static void main(String[] args) {
        aaa();
    }

    static void aaa() {
        bbb();
    } 
    
    static void bbb() {
        ccc();
    }

    static void ccc() {
        int x = 12/0;
    }

}
/*OUTPUT:
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at N.ccc(N.java:16)
        at N.bbb(N.java:12)
        at N.aaa(N.java:8)
        at N.main(N.java:4)
 */