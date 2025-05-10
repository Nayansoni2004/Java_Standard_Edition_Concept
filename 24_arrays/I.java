class I {
    public static void main(String[] args) {
        int[] x = {13, 10, 91}; //length: 0,1,2

        System.out.println(x[3]); //accessing the element through index(3) which does not exists...
    }
}
/*
code compilation passed but exception at runtime, on accessing the element at index which does not exists so
runtime give (ArrayIndexOutOfBounds) exception.

Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        at I.main(I.java:5)
 */