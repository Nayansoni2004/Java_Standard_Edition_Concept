class W {
    //main method
    public static void main(String[] args) {
        System.out.println("G");
        aaa();
        System.out.println("D");
    }

    static void aaa() {
        System.out.println("A");
        try {
            bbb();
        } catch(ArithmeticException e) {
            System.out.println("ArithmeticException");
        }

        System.out.println("J");
    }

    static void bbb() {
        System.out.println("W");
        ccc();
        System.out.println("N");
    }

    static void ccc() {
        int x = 12/0;
        System.out.println("Y");
    }
}
/*OUTPUT:
D:\javaprac\32_Exception_Handling>java W
G
A
W
ArithmeticException
J
D
 */