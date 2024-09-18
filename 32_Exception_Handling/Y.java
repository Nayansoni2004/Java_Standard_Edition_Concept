class Y {
    //main method
    public static void main(String[] args) {
        System.out.println("G");
        aaa();
        System.out.println("D");
    }

    static void aaa() {
        System.out.println("A");
        bbb();
        System.out.println("J");
    }

    static void bbb() {
        System.out.println("W");
        ccc();
        System.out.println("N");
    }

    static void ccc() {
        try {
            int x = 12/0;
        } catch(ArithmeticException e) {
            System.out.println("ArithmeticException");
            System.out.println("Stack Trace");
            e.printStackTrace();
        }

        System.out.println("Y");
    }
}
/*OUTPUT:
G
A
W
ArithmeticException
Stack Trace
java.lang.ArithmeticException: / by zero
        at Y.ccc(Y.java:23)
        at Y.bbb(Y.java:17)
        at Y.aaa(Y.java:11)
        at Y.main(Y.java:5)
Y
N
J
D
*/