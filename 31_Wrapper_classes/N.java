class N {
    //main method
    public static void main(String[] args) {
        int a = 123;

        String x = a.toString();

        System.out.println(x);
    }
}
/*OUTPUT:
N.java:6: error: int cannot be dereferenced
        String x = a.toString();
                    ^
1 error
*/