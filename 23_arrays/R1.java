class R1 {  
    public static void main(String[] args) {
        long l = 400L;
        float f = 21.34f;
        double d = 456.87;

        int[] x = {l, f, d};

        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
    }
}
/* error: because assigning larger datatype variables into lower datatype int array, so explicit conversion needed.
R1.java:7: error: incompatible types: possible lossy conversion from long to int
        int[] x = {l, f, d};
                   ^
R1.java:7: error: incompatible types: possible lossy conversion from float to int
        int[] x = {l, f, d};
                      ^
R1.java:7: error: incompatible types: possible lossy conversion from double to int
        int[] x = {l, f, d};
                         ^
3 errors
 */