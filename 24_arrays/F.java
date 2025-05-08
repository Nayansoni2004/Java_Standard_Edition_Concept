class F {
    static int[] x; //array declaration
    public static void main(String[] args) {
        System.out.println(x[0]); //accessing array element without instantiation
    }
}
/*code compiles successfully but exception at runtime because an array object */