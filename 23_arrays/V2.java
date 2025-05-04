class V2 {
    public static void main(String[] args) {
        long l = 9L; //lower datatype

        float f = l; //larger datatype

        System.out.println(l);
        System.out.println(f);
    }
}
/* OUTPUT
9
9.0 <-zero is implicit work by the compiler because of float conversion.
 */