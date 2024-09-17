class K {
    //main method
    public static void main(String[] args) {
        short a = 56;

        String x = a.toString();

        System.out.println(x);
    }
}
/*OUTPUT:
K.java:6: error: short cannot be dereferenced
        String x = a.toString();
                    ^
1 error
*/