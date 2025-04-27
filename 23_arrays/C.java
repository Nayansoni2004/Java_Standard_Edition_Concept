class C {
    //array declaration
    static int[] x;  //iske andar galti se bhi size nhi likhna h.

    //main method 
    public static void main(String[] args) {
        System.out.println(x.length);
    }
}
/* Exception in thread "main" java.lang.NullPointerException: Cannot read the array length because "C.x" is null
        at C.main(C.java:7)
runtime exception(error) aaya kyuki entire arr. obj. ref. var. implicitely agar "null" value se initialize h or 
us ref. var. k through kisi member ko access krte h ,to runtime exception occur hota h.
or kyuki entire arr. obj. ref. var. m null value assign h to us object ko nullpointer kehte h,us null pointer ko
padh sakte h, matlab compile to ho jayega lekin runtime error aayegi...
*/