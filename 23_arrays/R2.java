class R2 {
    public static void main(String[] args) {
        long l = 400L;
        float f = 21.34f;
        double d = 456.87;

        int[] x = {(int)l, (int)f, (int)d};

        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
    }
}
/* assigning larger datatype variables into lower datatype int of array variable by explicit conversion into int so file compiles successfully.
OUTPUT
400
21
456
 */